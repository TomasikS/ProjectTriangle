public class Triangle {
private  Point x;
private Point y;
private Point z;


   public  Triangle(Point x, Point y, Point z) {
       this.x=x;
       this.y=y;
       this.z=z;


   }





   double getPerimeter(){
       return (x.getDistance(x,y)+x.getDistance(x,z) + x.getDistance(z,y)    );

   }


    double getArea(){
double s= getPerimeter()/2;
double a= x.getDistance(x,y);
        double b= x.getDistance(z,y);
        double c= x.getDistance(x,z);
        System.out.println(a); System.out.println(b); System.out.println(c);


return ( (s)* (s-a)*(s-b) * (s-c));
    }
}
