package datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnector {

    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://78.47.162.168:3306/" + "primary?user=usr2&password=Vlrn123!");
           // Connection con = DriverManager.getConnection("jdbc:mysql://mysql-db.caprover.diplomportal.dk/" + "s112786?user=s112786&password=5soljNiFdF05umXE5OwAB");
           // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-test", "root", "T3stT3st123!");
       return con;
        }catch(Exception e){
            e.printStackTrace();
        }
    return null;
    }
}
