/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Date;

/**
 *
 * @author pc
 */
public class Bet {
   
   private int ID; 
    private int IDUser;
    private Date date;
    private int drawID;
    private int bet1, bet2, bet3,bet4,bet5;
    
    
    
    public Bet(int a, int b, Date c, int c1, int c2, int c3, int c4, int c5 ){
    
    
    }
    
    public int getID(){return ID;}
    public int getIDUser(){return IDUser;}
    public Date getDate(){return date;}
    public int getdrawID(){return drawID;}
    public int getbet1(){return bet1;}
       public int getbet2(){return bet2;}
         public int getbet3(){return bet3;}
        public int getbet4(){return bet4;}
      public int getbet5(){return bet5;}
    
}
