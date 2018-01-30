/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author pc
 */
public class MySQLDatabase {
    private final String url = "jdbc:mysql://localhost:3306//";
    private final String dbname = "tipos";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "user2";
    private final String password = "secret";
    private Connection conn;


    public void TestConnection() {
       

      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet = null;

      try{
         connection=DriverManager.getConnection
            (url,user,password);
         statement=connection.createStatement();
     /*    resultSet=statement.executeQuery
            ("SELECT * FROM books");
         while(resultSet.next()){
            System.out.printf("%s\t%s\t%s\t%f\n",
            resultSet.getString(1),
            resultSet.getString(2),
            resultSet.getString(3),
            resultSet.getFloat(4));
         }*/

      }catch(SQLException ex){
      }finally{
         try {
            resultSet.close();
            statement.close();
            connection.close();
         } catch (SQLException ex) {
         }
      }
   }
}

