import java.sql.*;

public class DBConnectionTester {


    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spike01","root","SQL6112@99");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from games");
            while(resultSet.next()){
                System.out.println(resultSet.getString("gameName"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}