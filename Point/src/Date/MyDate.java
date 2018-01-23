package Date;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MyDate {
Date datum=new Date();


public void Today(){
    System.out.println(datum.toString());

    }


    public void Today2  (){

    Date d=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String date = format.format(d);
        System.out.println(date);
    }




}
