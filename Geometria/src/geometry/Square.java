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
public class Square {
  private  double a;
 
 
 
 public Square(double i)
 {
 a=i;
 
 }
 
 
 public Square(){
 a=0;
 }
 
double geta() {return a;}

 

public double obsah(){return a*a;}

public  double obvod(){return 4*a;}

public   double getdiagonal(){return Math.sqrt(a*a);}
 
}
