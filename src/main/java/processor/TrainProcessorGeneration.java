package processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import ru.rzd.train.Train;
import ru.rzd.train.Wagon;

import java.util.List;
import java.util.UUID;

public class TrainProcessorGeneration implements Processor {

    public void process(Exchange exchange) {
       Train body = exchange.getIn().getBody(Train.class);

       body.setId(generateUUID());
       generateWagonsId(body.getWagons());

       exchange.getOut().setBody(body);
    }

    public String generateUUID(){
       return UUID.randomUUID().toString();
    }

    public void generateWagonsId(List<Wagon> wagons) {
        for (Wagon wagon:wagons) {
            if (wagon.getId() != null) {
                wagon.setId(generateUUID());
            }
        }
    }
}
