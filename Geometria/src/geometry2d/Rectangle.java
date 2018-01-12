/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry2d;

/**
 *
 * @author pc
 */
public class Rectangle implements Operation, Diagonal{
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
  
 

public   double obvod(){return 2*(a+b);}

 @Override
 public  double getdiagonal(){return Math.sqrt(a*b);}
  
  public void change(){
  double temp=a;
  a=b;b=temp;
  }

    @Override
    public double getArea() {
         return a*b;
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
  
 
}
