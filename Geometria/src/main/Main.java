/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import geometry2d.Circle;
import geometry2d.Square;
import geometry2d.Rectangle;
import geometry2d.Triangle;
import geometry3d.Ball;
import geometry3d.Cube;
import geometry3d.Kvader;

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
       
        
        double a=s.getArea();
        
        double b=s.obvod();
        
      
        double e=s.getdiagonal();
         
          System.out.println("stvorec 1" );
        System.out.println("obsah"+a);
        System.out.println("obvod"+b);
        System.out.println("uhlopriecka"+e);
        
        Rectangle r=new Rectangle(20.2,10.5);
        
        
        double c=r.getdiagonal();
        double d=r.getArea();
        double f=r.obvod();
        
         System.out.println("obdlznik 1" );
        System.out.println("obsah"+d);
        System.out.println("obvod"+f);
        System.out.println("uhlopriecka"+c);
        
        
          Rectangle r1=new Rectangle(10);
        
        
        double q1=r1.getdiagonal();
        double q2=r1.getArea();
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
          
          
           Triangle t2=new Triangle(3,4,5); 
          if(t2.nerovnost()==true ) System.out.println("plati nerovnost");
         if(t2.nerovnost()==false ) System.out.println("neplati nerovnost");
          
          
          Triangle t3=new Triangle(4,4,5); 
          
                if(t3.rovnoramenny()==true ) System.out.println("je rovnoramenny");
         if(t3.rovnoramenny()==false ) System.out.println("nie je rovnoramenny");
          
                Triangle t4=new Triangle(5,5,5); 
          
                if(t4.rovnostranny()==true ) System.out.println("je rovnostranny");
         if(t4.rovnostranny()==false ) System.out.println("nie je rovnostranny");
          
         
         Circle k=new Circle(7.5);
         System.out.println("obvod"+ k.getPerimeter());
          System.out.println("obsah"+ k.getArea());
          
          
          
          Ball q=new Ball(4.75);
          System.out.println(q.getSurface());
              System.out.println(q.getVolume());
              
              
               Cube cu=new Cube(8.88);
            System.out.println(cu.getSurface());
              System.out.println(cu.getVolume());
              System.out.println(cu.uhl());
              
              Kvader kv=new Kvader(10.4,15,16.75);
              
                 System.out.println(kv.getSurface());
                       System.out.println(kv.getVolume());
                   System.out.println(kv.uhl());
    }

  
    
}
