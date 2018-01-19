
import java.util.Random;
public class Point3D extends Point {
    private int z;

    public int getz(){return z;}

    public Point3D(){z=0;}

    public Point3D(int a, int b, int c){
        super(a,b); z=c;

    }

    @Override
    public double getDistance (){

        return Math.sqrt(getx()*getx()+gety()*gety()+getz()*getz());
    }


    @Override
    public void generateRandomCoord(){
//-20 to 20
        Random r=new Random();
        this.z=r.nextInt(41)-20;
        super.generateRandomCoord();
    }


    public double getDistance (Point3D p1,Point3D p2){

        return Math.sqrt(Math.pow(p2.getx()-p1.getx(),2 ) + Math.pow(p2.gety()-p1.gety(),2 )  + Math.pow(p2.z-p1.z,2 )      );
    }


    @Override
    public void PrintInfo(){

        System.out.println("x"+ getx());
        System.out.println("y" + gety());
        System.out.println("z"+z);
        System.out.println("distance"+getDistance());


    }








}