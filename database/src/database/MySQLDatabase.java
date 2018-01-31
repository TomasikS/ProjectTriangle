/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mysql.jdbc.PreparedStatement;
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
   private static final String driver = "com.mysql.jdbc.Driver";
    private  static final String user = "user2";
    private  static final String password = "secret";
    private  static Connection conn;
private static final String url = "jdbc:mysql://localhost:3306/tipos";

    public void TestConnection() throws ClassNotFoundException {
       

      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet = null;

      try {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
          conn= DriverManager.getConnection(url,user, password);

        }



             catch(Exception e) {  System.out.println("error");}





    if(conn==null)      System.out.println("error");
    else        System.out.println("ok");

        }
    
    public boolean insertValuesIntoDrawHistory(int arr[]){
        try{
        Class.forName(driver).newInstance();
        conn= DriverManager.getConnection(url, user,password);
            String cmd="INSERT INTO betdetails(ball1, ball2, ball3, ball4, ball5) ";
            cmd+=" VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(cmd);
            preparedStatement.setInt(1,arr[0]);
            preparedStatement.setInt(2,arr[1]);
            preparedStatement.setInt(3,arr[2]);
            preparedStatement.setInt(4,arr[3]);
            preparedStatement.setInt(5,arr[4]);
            preparedStatement.executeUpdate();
            conn.close();
        }


        catch(Exception e){
            System.out.println("Error. I cannot connect to the database!");
        }
        return true;
    }
    
    
    
    
    public void getnewBets(){
    
    
      try {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
          conn= DriverManager.getConnection(url,"user1", password);

          String cmd="SELECT *FROM Bets INNER JOIN betdetails ON Bets.id=betsdetails.id WHERE drawID  is null";
           PreparedStatement preparedStatement =(PreparedStatement) conn.prepareStatement(cmd);
          
        }



             catch(Exception e) {  System.out.println(e.getMessage());}
if(conn==null)      System.out.println("error");
    else        System.out.println("ok");
    
   }

   }
