import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2/1/17.
 */
public class MySQLAdsDAO implements Ads{
    private Connection connection;

    public MySQLAdsDAO() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.url,
                    Config.username,
                    Config.password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Ad> all() {
        List <Ad> ads = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");

            while (rs.next()) {
                long id = rs.getLong("id");
                long userId = rs.getLong("user_id");
                String title = rs.getString("title");
                String description = rs.getString("description");

                Ad ad = new Ad(id,userId ,title, description);
                ads.add(ad);
            }

            return ads;

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert(Ad ad) {
        String insertSQL = "INSERT  INTO ads (user_id, title, description) VALUES" +
                "( " + ad.getUserId() + ", "
                + "'" + ad.getTitle() + "', "
                + "'" +  ad.getDescription() + "')";

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
