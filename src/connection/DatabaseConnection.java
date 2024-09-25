
package connection;

import java.sql.DriverManager;
import java.sql.Connection;
//import java.sql.SQLException;

public class DatabaseConnection {
    private Connection con;
    private static DatabaseConnection dbc ;
    private DatabaseConnection()
    {
        try {
             Class.forName("com.mysql.jdbc.Driver");
             con =DriverManager.getConnection("jdbc:mysql://localhost:3306/matinfo", "root", "");
            System.out.println("Connection etablie");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
      public static DatabaseConnection getDatabaseConnection(){
                if(dbc==null){
           dbc= new DatabaseConnection();
        }
        return dbc ;  
      }
   public Connection getConnection()
  {
      return con;
  }
          
          /*
            public static  void main(String[] args){
        new DatabaseConnection();
    }
          */
}
