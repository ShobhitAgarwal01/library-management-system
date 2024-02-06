package lib.mgmt.system.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
    public static Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/libmgmtsys","root","Shobhit23");
        } catch (Exception exception){
            System.err.println(exception);
        }
        return connection;
    }
}
