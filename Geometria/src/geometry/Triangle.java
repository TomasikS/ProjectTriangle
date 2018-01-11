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
public class Triangle {
    private double a;
    
    private double b;
    
    private double c;
    
    
   public Triangle (){
   a=3;
           b=4;
           c=5;
   }
   
   public Triangle(double e, double f, double g){
   a=e;b=f;c=g; 
   
   }
   
    
   
   
   public double Obvod(){
   return (a+b+c);
   }
   
   
   public double getarea(){
   
   double spo;
   spo=a+b+c;
   spo=spo/2;
   
   return Math.sqrt( spo* (spo-a)* (spo-b)*(spo -c));
   }
   
   
   
   public boolean IsRightTriangle(){
   if ((Math.pow(a, 2)) +Math.pow(b, 2) == Math.pow(c, 2)) return true;
   else  if(a*a + c*c == b*b) return true;
   else if(b*b+c*c==a*a) return true;
   else return false;
   
   }
   
   
   
   
}
