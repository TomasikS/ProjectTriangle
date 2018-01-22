public class Main {




        public static void main(String[] args) {
            Point p=new Point(8,12);
            System.out.println(p.getquadrant()+ "kvadrant");


            Point p2=new Point();
            p2.generateRandomCoord();
            System.out.println(p2.getquadrant()+ "kvadrant");
            System.out.println( p2.getDistance()+ "vzdialenost");
            p.PrintInfo();
            System.out.println( "Distance p and p2"+  p2.getDistance(p, p2));

            Point3D bod = new Point3D(10,55,66);
            Point3D bod2 = new Point3D(20,35,100);

            System.out.println("medzi bodmi vzdialenost");
            bod.getDistance(bod, bod2);
            System.out.println("distance"+bod.getDistance());
            bod.PrintInfo();
            Object o1=new Point();
            Point p3=new Point3D(2,8,7);
            Point3D p33= (Point3D) p3;
            Geometry g1;
            g1=new Point(5,-9);
            ((Point)g1).PrintInfo();

           Point []pole=new Point[10];

           for(int i=0;i<10;i++) {
               Point3D p1=new Point3D();
               p1.generateRandomCoord();
               pole[i] = p1;
           }

            for(int i=0;i<10;i++) { System.out.println(pole[i].getx());System.out.println(pole[i].gety());  System.out.println("-------------");    }

          Geometry [] arr=new  Geometry[10];

            for(int i=0;i<10;i++)
            {
                p3.generateRandomCoord();
              arr[i]=p3;
        }



        for(Geometry g:arr) {
            ((Point3D)g).PrintInfo();


        }

Point bod15=new Point(2,5);
            Point bod17=new Point(8,9);


            Point bod16=new Point(4,8);

            Line line1=new Line(bod15, bod16);

Line line2=new Line(1,3,4,6);
System.out.println(line1.GetLength());
Point bodd=line2.GetMiddleofLine();
 bodd.PrintInfo();

 Triangle tr=new Triangle(bod15,bod16, bod17);

            System.out.println("perimeter"+tr.getPerimeter());
            System.out.println("area"+tr.getArea());
        }

    }


