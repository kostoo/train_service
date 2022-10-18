package processor;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import ru.rzd.train.Train;
import ru.rzd.train.Wagon;

import java.sql.*;
import java.util.List;
import java.util.UUID;

public class TrainDbGeneration implements Processor {

    @Override
    public void process(Exchange exchange) {
        Train body = exchange.getIn().getBody(Train.class);
        createSqlQuery(body);
    }

    public static void createSqlQuery(Train train) {
        try {
            String urlConnection = "jdbc:postgresql://localhost:5432/trainServiceDb?serverTimezone=Europe/Moscow";
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();

            try (Connection conn = DriverManager.getConnection(urlConnection, "nikita","nikita")){
                prepareStatementQueryTrain(conn, train);
                prepareStatementQueryWagons(conn, train.getWagons().getWagon(), train.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void prepareStatementQueryTrain(Connection conn, Train objectAdd) throws SQLException {
        String insertTrainSql = "INSERT INTO train(id, name, locomotive_type, date_time)values(?, ?, ?, ?)";

        PreparedStatement preparedStatement = conn.prepareStatement(insertTrainSql);
        preparedStatement.setObject(1, UUID.fromString(objectAdd.getId()));
        preparedStatement.setString(2, objectAdd.getName());
        preparedStatement.setString(3, objectAdd.getLocomotiveType());
        preparedStatement.setTimestamp(
                4, new Timestamp(objectAdd.getFormDate().toGregorianCalendar().getTimeInMillis())
        );
        preparedStatement.execute();
    }

    public static void prepareStatementQueryWagons(Connection conn, List<Wagon> wagons, String trainUUID)
                                                                                    throws SQLException {
        String insertTrainSql = "INSERT INTO wagon(id, num, seats, type, id_train)values(?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = conn.prepareStatement(insertTrainSql);
        for (Wagon wagon:wagons) {
            preparedStatement.setObject(1, UUID.fromString(wagon.getId()));
            preparedStatement.setInt(2, wagon.getNum());
            preparedStatement.setInt(3, wagon.getSeats());
            preparedStatement.setString(4, wagon.getType());
            preparedStatement.setObject(5, UUID.fromString(trainUUID));
            preparedStatement.execute();
        }
    }
}
