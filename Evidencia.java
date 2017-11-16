/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Evidencia {

    /**
     * @param args the command line arguments
     */
    
    
    
    float salary;
    String name;
    String city;
    
    
    public Evidencia(String s, String k, float f  ){
    this.salary=f;
    this.name=s;
    this.city=k;
    
    }
    
    public static void main(String[] args) {
        Evidencia s1=new Evidencia("Milan","Kosice",3000);
         Evidencia s2=new Evidencia("Jozo","Kosice",2000);
             Evidencia s3=new Evidencia("Jozo","Presov",2500);
           Evidencia s4=new Evidencia("Jan","Presov",3500);
        Evidencia s5=new Evidencia("Jan","Kosice",1500);
        Evidencia s6=new Evidencia("Jan","Kosice",2500);
         Evidencia s7=new Evidencia("Fero","Kosice",2000);
          Evidencia s8=new Evidencia("Fero","Presov",2300);
         Evidencia s9=new Evidencia("Fero","Kosice",3300);
         Evidencia s10=new Evidencia("Viktor","Presov",2000);
        
         ArrayList <Evidencia>zoznam  = new ArrayList();
        zoznam.add(s1);
        zoznam.add(s2);
        zoznam.add(s3);
        zoznam.add(s4);
        zoznam.add(s5);zoznam.add(s6);zoznam.add(s7);zoznam.add(s8);zoznam.add(s9);zoznam.add(s9);zoznam.add(s10);
        
        
        for(int i=0;i<zoznam.size();i++)
        {
            System.out.println(zoznam.get(i).name);
        System.out.println(zoznam.get(i).city);
        System.out.println(zoznam.get(i).salary);
    
    }
    
    for(int i=0;i<zoznam.size();i++){
    if(zoznam.get(i).name.length() > 7)System.out.println(zoznam.get(i).name);
    }

     for(int i=0;i<zoznam.size();i++)
     {
         if((zoznam.get(i).salary>1200)&&(zoznam.get(i).salary<2000))
             System.out.println(zoznam.get(i).name);
             
     }
     
     
     int count=0;
       for(int i=0;i<zoznam.size();i++)
     {
         if(zoznam.get(i).city.equals("Presov")) count++;
             System.out.println(zoznam.get(i).name);
             
              System.out.println("count students from Presov"+ count );
             
             
     }
     
     
     int sum = 0;
     double p;
        for(int i=0;i<zoznam.size();i++)
     {
     
     sum=(int) (zoznam.get(i).salary+sum);
     
     }
     
     p=sum/10;
     
     System.out.println("average salary"+p);
     
     
     
     int max=(int) zoznam.get(0).salary;
     
     int j=0;
       for(int i=1;i<zoznam.size();i++)
     
     if(zoznam.get(i).salary <max){max=(int) zoznam.get(i).salary;
     j=i;
     
     } 
       
        System.out.println("maximum salary"+max);
    System.out.println("maximum salary has"+ zoznam.get(j).name);
    
    int pom;
       for(int i=0;i<zoznam.size();i++){
     for(int k=0;k<zoznam.size()-1;k++){
    
         if(zoznam.get(i).salary< zoznam.get(k).salary) 
         {
         pom=(int) zoznam.get(i).salary;
         
             zoznam.get(i).salary=zoznam.get(k).salary;
             zoznam.get(k).salary=pom;
         }
     }
       
       }
       
       
           for(int i=0;i<zoznam.size();i++)
       System.out.println( zoznam.get(i).salary);
       
       
       double avgp;
       int suma = 0;
       int cv=0;
          System.out.println( "Students from Kosice");
         for(int i=0;i<zoznam.size();i++)
       if(zoznam.get(i).city.startsWith("K"))
       {
           cv++;
        suma=(int) (suma+zoznam.get(i).salary);
       
       }
       
    avgp=suma/cv;
     System.out.println( "avg salary Students from Kosice"+avgp);
    
}}     