public class Line {

  private  Point a;
  private  Point b;


  public Line(Point a, Point b){
      this.a=a;
      this.b=b;

  }

    public Line(int xa, int ya, int xb, int yb ){
        a=new Point(xa,ya);
        b=new Point(xb,yb);

    }

    public double GetLength(){


      return a.getDistance(a,b);
    }

    public Point GetMiddleofLine(){

      return new Point((a.getx()+b.getx()/2),(a.gety()+b.gety()/2) );
    }


    public boolean IsparallelwithosX(){

    return  (a.gety() == b.gety()) ;
    }


    public boolean IsparallelwithosY(){

        return  (a.getx() == b.getx()) ;
    }





}
