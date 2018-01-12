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
public class Cube implements Computing {
private double a;

public Cube(double i){

a=i;

}

    @Override
    public double getSurface() {
        return 6*a*a;
    }

    @Override
    public double getVolume() {
        return a*a*a;
    }
    
  public  double uhl(){
    return Math.sqrt(3)*a;
    }
}
