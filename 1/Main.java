/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Car car1=new Car();
    car1.setbrand("Audi A8");
    car1.setconsum(15.7f);
    car1.setengine(false);
    car1.setspeed(0);
    car1.PrintInfo();
   
   Car car2 = new Car(7.5f, "Skoda"  );
    car2.PrintInfo();
    
    car2.PrintInfo();
    
    car2.StartEngine();
    
    car2.PrintInfo();
    
    car2.IncreaseSpeed();
    car2.PrintInfo();
    
 System.out.println(car2.getPrice(800, 3.80f));
    
    }
    
}
