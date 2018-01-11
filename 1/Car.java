
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Car {
 private String brand;   
 private int speed;   
 private boolean engine; 
 private float consum ;
 private boolean frontWiger;
 private String spz;
      String s1;  
 private int capacity;
private  String colour;
  private int price;    
         
  public Car(){

speed=0;
engine=false;
consum=7.9f;
brand=null;
frontWiger=false;
  }
 
  
    public Car(float s, String f){

speed=0;
engine=false;
consum=s;
brand=f;
  }
    
      public Car(float s, String f, String city){

speed=0;
engine=false;
consum=s;
brand=f;
generate(city);
  }
    public Car( int c, String i, int k){
 capacity=c;
 colour=i;
 price=k;
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

  
  public void IncreaseSpeed(int v){
  if ((engine==true) && (v>0)) speed+=v;
  }

public int getspeed()
        
{
return speed;
}

  
public void turnOnfrontWiger()
        
{
frontWiger=true;
}

public void turnOffrontWiger()
        
{
frontWiger=false;
}


private void generate(String city){
     
    
if (city.toLowerCase().equals("kosice"))
    s1="KE-";

if (city.toLowerCase().equals("zilina"))
    s1="ZA-";


if (city.toLowerCase().equals("trencin"))
    s1="TN-";

    
if (city.toLowerCase().equals("presov"))
    s1="PO-";


if (city.toLowerCase().equals("nitra"))
    s1="NR-";


if (city.toLowerCase().equals("senec"))
    s1="SC-";
 

Random r=new Random( );
int c1=r.nextInt(9);
int c2=r.nextInt(9);
int c3=r.nextInt(9);

s1=s1+String.valueOf(c1)+  String.valueOf(c2)+String.valueOf(c3)   ;

  
    
char p1 = (char) (r.nextInt(26) + 'a');
char p2 = (char) (r.nextInt(26) + 'a');

  
  spz=s1+ "-"+ p1+p2;
  spz=spz.toUpperCase();
System.out.println(spz);

 

 }

public String getspz(){return spz;}

public void setcapacity(int u)
{
capacity=u;
}


public void setprice( int y){
price=y;
}

public void setcolour(String j){
colour =j;
}

int getprice(){return price;}


public String getcolour()
        
{return colour;}
        
public int getcapacity(){
return capacity;
}




 }
