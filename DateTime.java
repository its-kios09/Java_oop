import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static void main(String[] args){
        Date datetime = new Date();
        String date = datetime.toString();
        System.out.println("<<<<<<<<Current time:- " + date + " >>>>>>>>>>>>> \n\n");
        System.out.println("<<<<<<<<Formatting time>>>>>>>>>>>>>");
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("<<<<<<<<Current time:- " + ft.format(datetime) + " >>>>>>>>>>>>> \n\n");



    }
}
