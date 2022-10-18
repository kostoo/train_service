package processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.rzd.train.Train;
import ru.rzd.train.Wagon;

import java.util.List;
import java.util.UUID;

public class TrainProcessorGeneration implements Processor {

    private final Logger logger = LoggerFactory.getLogger(TrainProcessorGeneration.class);

    public void process(Exchange exchange) {
           Train body = exchange.getIn().getBody(Train.class);

           body.setId(generateUUID());
           generateWagonsId(body.getWagons().getWagon());

           exchange.getOut().setBody(body);
           logger.info(
                   "путь поезда " + body.getName() +" количество вагонов " + (long) body.getWagons().getWagon().size()
           );
    }

    public String generateUUID(){
       return UUID.randomUUID().toString();
    }

    public void generateWagonsId(List<Wagon> wagons) {
        try{
        for (Wagon wagon:wagons) {
            if (wagon.getId() == null) {
                wagon.setId(generateUUID());
            }
        }} catch (Exception e) {
            System.out.println(e);
        }
    }
}
