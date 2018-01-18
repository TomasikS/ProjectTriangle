/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.academiasovy.point;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Point p=new Point(8,12);
    System.out.println(p.getquadrant()+ "kvadrant");
    
    
        Point p2=new Point();
        p2.generateRandomCoord();
    System.out.println(p2.getquadrant()+ "kvadrant");
   System.out.println( p2.getDistance()+ "vzdialenost");  
    p.PrintInfo();
     System.out.println( "Distance p and p2"+  p2.getDistance(p, p2));
    
     Point3D bod = new Point3D(10,55,66);
     Point3D bod2 = new Point3D(20,35,100);
     
     System.out.println("medzi bodmi vzdialenost");
     bod.getDistance(bod, bod2);
   System.out.println("distance"+bod.getDistance());
   bod.PrintInfo();
   
    }
    
}
