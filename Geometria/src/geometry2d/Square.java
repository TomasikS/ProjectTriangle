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
public class Square implements Operation, Diagonal {
  private  double a;
 
 
 
 public Square(double i)
 {
 a=i;
 
 }
 
 
 public Square(){
 a=0;
 }
 
double geta() {return a;}

 

 

public  double obvod(){return 4*a;}

  @Override
  public   double getdiagonal(){return Math.sqrt(a*a);}

    @Override
    public double getArea() {
         return a*a;
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
