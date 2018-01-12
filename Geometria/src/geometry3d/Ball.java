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
public class Ball implements Computing {
  double r;  

  
  public Ball(double k){
  r=k;
  }
  
    @Override
    public double getSurface() {
       return 4*Math.PI*r*r;
    }

    @Override
    public double getVolume() {
       return 4/3*Math.PI*r*r*r;
    }
}
