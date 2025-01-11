import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String URL = "jdbc:postgresql://SG-empty-tennis-8431-6471-pgsql-master.servers.mongodirector.com:6432/sales_database";
    private static final String USER = "sgpostgres";
    private static final String PASSWORD = "6Bh1BFGR!7Ptt3zN";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
