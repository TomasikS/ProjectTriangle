/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author pc
 */
public class Database {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws ClassNotFoundException

    {Tipos t=new Tipos();
        t.generate();
        MySQLDatabase m=new MySQLDatabase();
        m.TestConnection();
    }
    
}
