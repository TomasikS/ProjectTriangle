public class Triangle implements TriangleInterface {
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


    public boolean Rovnostranny() {
        return (x.getDistance(x,y) == x.getDistance(z,y))&& (x.getDistance(z,y)== x.getDistance(x,z));

    }

    public boolean Pravouhly() {
      double c=x.getDistance(x,y);
      double a= x.getDistance(z,y);
        double b= x.getDistance(z,x);

        if(a*a + b*b == c*c)  return true;
        if(c*c + b*b == a*a)  return true;
        if(a*a + c*c == b*b)  return true;

     else return false;

    }


    public boolean Rovnoramenny(){

        double c=x.getDistance(x,y);
        double a= x.getDistance(z,y);
        double b= x.getDistance(z,x);
       if((a==b) &&(b!=c)) return true;
        if((c==b) &&(a!=c)) return true;
        if((a==c) &&(b!=c)) return true;
        else return false;
    }






}
