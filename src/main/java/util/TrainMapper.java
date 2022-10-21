package util;

import ru.rzd.train.Train;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TrainMapper {

    public Map<String, Object> getMapTrain(Train train) {
        Map<String, Object> answer = new HashMap<>();
        answer.put("TrainId", UUID.fromString(train.getId()));
        answer.put("TrainName", train.getName());
        answer.put("TrainLocomotiveType", train.getLocomotiveType());
        answer.put("TrainDateTime", new Timestamp(train.getFormDate().toGregorianCalendar().getTimeInMillis()));
        answer.put("TrainWagons", train.getWagons().getWagon());
        return answer;
    }
}
