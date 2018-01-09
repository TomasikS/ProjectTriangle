/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */

 public class Car {
 private String brand;   
 private int speed;   
 private boolean engine; 
 private float consum ;
   
  public Car(){

speed=0;
engine=false;
consum=7.9f;
brand=null;
  }
 
  
    public Car(float s, String f){

speed=0;
engine=false;
consum=s;
brand=f;
  }
  
  
  
  public void setbrand(String value){
  brand=value;
  }
  
   
  public void setconsum(float value){
  consum=value;
  }
  
  
   public void setspeed(int value){
  speed=value;
  }
  
  
   public void setengine(boolean value){
  engine=value;
  }
  
  
  public void PrintInfo(){
  System.out.println("brand"+brand);
    System.out.println("consum"+consum);
    System.out.println("speed"+speed);
    System.out.println("engine"+engine);
  }

  
  public void StartEngine(){
  
  engine=true;
  }

public void StopEngine(){
engine =false;
}
  public void IncreaseSpeed(){
  if (engine==true) speed+=10;
  }
  
   public void DecreaseSpeed(){
       
         speed-=10;
  if ( speed <0) speed=0;
     
  }
   
   public void Stop(){
   speed=0;
   
   }
   
  public float getPrice(int distance, float costPerLiter)
          
  {
  consum=(distance/100) * costPerLiter;
      
return consum;  
  }


 }






