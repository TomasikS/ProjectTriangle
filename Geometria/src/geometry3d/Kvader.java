/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry3d;

/**
 *
 * @author pc
 */
public class Kvader implements Computing {
private double a;
private double b;
private double c;
    public Kvader(double o, double p, double w){
    a=o;
    b=p;
    c=w;
    }
    
    
    @Override
    public double getSurface() {
         return 2* (a*b+b*c+a*c);
    }

    @Override
    public double getVolume() {
       return a*b*c;
    }
    
   public double uhl(){
    return Math.sqrt(a*a+b*b+c*c);
    }
    
}
