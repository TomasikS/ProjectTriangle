/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.academiasovy.point;

import java.util.Random;

/**
 *
 * @author pc
 */
public class Point {
int x;
int y;


public Point(int a, int b){
this.x=a;this.y=b;
}

public Point(){
//x=0;y=0;

this(0,0);

}

public int getx(){return x;}
public int gety(){return y;}

public int getquadrant(){
if((x >0) && (y >0)) return 1;
else if((x<0) && (y>0)) return 3;
else if((x<0) && (y<0)) return  4;
else if((x>0)&&( y<0 ) ) return 2;

else return 0;
}

public void generateRandomCoord(){
//-20 to 20
Random r=new Random();
this.x=r.nextInt(41)-20;
this.y=r.nextInt(41)-20;

}



public double getDistance (){

    return Math.sqrt(x*x+y*y);
}


public void PrintInfo(){


System.out.println(getx());

System.out.println(gety());

System.out.println(getDistance());

System.out.println(getquadrant());

}
public double getDistance (Point p1,Point p2){

    return Math.sqrt(Math.pow(p2.x-p1.x,2 ) + Math.pow(p2.y-p1.y,2 )      );
}

public void axialsymetry(String s){
    
if(s.equals("x"))x =-x;
else if(s.equals("y"))y =-y;


}

public void centralsymetry(){
    
x =-x;
y =-y;
}






}
