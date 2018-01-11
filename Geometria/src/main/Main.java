/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import geometry.Square;
import geometry.Rectangle;
import geometry.Triangle;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square s=new Square(10.25);
       
        
        double a=s.obsah();
        
        double b=s.obvod();
        
      
        double e=s.getdiagonal();
         
          System.out.println("stvorec 1" );
        System.out.println("obsah"+a);
        System.out.println("obvod"+b);
        System.out.println("uhlopriecka"+e);
        
        Rectangle r=new Rectangle(20.2,10.5);
        
        
        double c=r.getdiagonal();
        double d=r.obsah();
        double f=r.obvod();
        
         System.out.println("obdlznik 1" );
        System.out.println("obsah"+d);
        System.out.println("obvod"+f);
        System.out.println("uhlopriecka"+c);
        
        
          Rectangle r1=new Rectangle(10);
        
        
        double q1=r1.getdiagonal();
        double q2=r1.obsah();
        double q3=r1.obvod();
        
        
        System.out.println("obdlznik 2" );
        System.out.println("obsah"+q2);
        System.out.println("obvod"+q3);
        System.out.println("uhlopriecka"+q1);
        
        Triangle t1=new Triangle(3,4,5);
        System.out.println("obvod"+t1.Obvod());
        System.out.println("obsah"+ t1.getarea());
        if(t1.IsRightTriangle()==true ) System.out.println("je pravohlý");
          if(t1.IsRightTriangle()==false ) System.out.println("nie je pravohlý");
    }

  
    
}
