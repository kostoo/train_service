package processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.rzd.train.Train;
import ru.rzd.train.Wagon;

import java.util.UUID;

public class TrainProcessorGeneration implements Processor {

    private final Logger logger = LoggerFactory.getLogger(TrainProcessorGeneration.class);

    @Override
    public void process(Exchange exchange) {
           Train body = exchange.getIn().getBody(Train.class);

           body.setId(generateUUID());
           generateWagonsId(body);

           exchange.getOut().setBody(body);
           logger.info(
              String.format("путь поезда %s  количество вагонов %d", body.getName(), body.getWagons().getWagon().size())
           );
    }

    public static String generateUUID(){
        return UUID.randomUUID().toString();
    }

    public static void generateWagonsId(Train train) {
        try {
            for (Wagon wagon : train.getWagons().getWagon()) {
                if (wagon.getId() == null) {
                    wagon.setId(generateUUID());
                    wagon.setUuidTrain(train.getId());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
