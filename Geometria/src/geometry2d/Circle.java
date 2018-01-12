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
public class Circle implements Operation {
double r;
   
public Circle(double v){

r=v;

}   
   
 public Circle()
 
 {
 r=4;
 
 }

    @Override
    public double getArea() {
  return Math.PI*r*r;
    }

    @Override
    public double getPerimeter() {
      return Math.PI*r*2;
    }
   
   
}
