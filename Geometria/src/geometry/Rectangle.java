/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author pc
 */
public class Rectangle {
 private double a;
 private double b;
 
 
 public Rectangle(double u, double h){
 a=u;b=h;
 }
 
  public Rectangle( ){
 a=0;b=0;
 }
 
  
   public Rectangle(double u){
 a=u;b=u;
 }
  
  public   double obsah(){return a*b;}

public   double obvod(){return 2*(a+b);}

public  double getdiagonal(){return Math.sqrt(a*b);}
  
  public void change(){
  double temp=a;
  a=b;b=temp;
  }
 
  
 
}
