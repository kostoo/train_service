package util;

import ru.rzd.train.Wagon;

import java.util.*;

public class WagonMapper {

    public Map<String, Object> getMapWagon(Wagon wagon) {
        Map<String, Object> answer = new HashMap<>();
        answer.put("WagonId",  UUID.fromString(wagon.getId()));
        answer.put("WagonNum", wagon.getNum());
        answer.put("WagonSeats", wagon.getSeats());
        answer.put("WagonType", wagon.getType());
        answer.put("UUIDTrain", UUID.fromString(wagon.getUuidTrain()));
        return answer;
    }
}

