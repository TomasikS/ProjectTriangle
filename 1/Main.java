
import java.util.Random;

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
   
   Car car2 = new Car(7.5f, "Skoda", "Kosice"  );
    car2.PrintInfo();
    
    car2.PrintInfo();
    
    car2.StartEngine();
    
    car2.PrintInfo();
    
    car2.IncreaseSpeed();
    car2.PrintInfo();
    
 System.out.println(car2.getPrice(800, 3.80f));
    
 car1.IncreaseSpeed(50);
  car2.IncreaseSpeed(70);
  
  if (car1.getspeed() < car2.getspeed())
      System.out.println("rýchlejšie je auto 2");
  
  
   if (car1.getspeed() >  car2.getspeed())
      System.out.println("rýchlejšie je auto 1");
  
  if (car1.getspeed() ==  car2.getspeed())
      System.out.println("rovnaké rýchlosti");
  Car car3=car2;
  
  
  car3 = new Car(7.5f, "Skoda", "Presov"  );
  
  Car taxi[]=new Car[10];

for (int i=0;i<=9;i++)
taxi[i]=new Car(150.15f,"Kia",  "Kosice" );


for (int i=0;i<=9;i++){
    
    System.out.println(taxi[i]);
}

for (int i=0;i<=9;i++) taxi[i].StartEngine();



for (int i=0;i<=9;i++)
{ 
    if (taxi[i].getspz().contains("8"))
System.out.println(taxi[i].getspz());
}
 
Random ran=new Random();
for (int i=0;i<=9;i++){
taxi[i].IncreaseSpeed(ran.nextInt(31)+40);
}


for (int i=0;i<=9;i++)
System.out.println("vypis rychlosti"+taxi[i].getspeed());

float max;
max=taxi[0].getspeed();
int u = 0;
for (int i=0;i<=9;i++) {
   if (max < taxi[i].getspeed()){ 
       
       max=taxi[i].getspeed();
u=i;
}}
System.out.println("best"+taxi[u].getspz());
System.out.println("best"+taxi[u].getspeed());



int p=taxi.length;
float pr;
float sum=0.0f;
for (int i=0;i<p;i++)
sum=sum+taxi[i].getspeed();

pr=sum/p;

System.out.println("priemerna rychlost"+pr);

int number=ran.nextInt(taxi.length);
System.out.println("zavola taxik"+taxi[number].getspz());
    }
    
}
