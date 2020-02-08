package HackerRank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;

public class TimeConversion {
    private static final DateFormat TWELVE_TF = new SimpleDateFormat("hh:mm:ssa");
    private static final DateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm:ss");

    static String timeConversion(String s)  {

        String str = null;

        try {
            str= TWENTY_FOUR_TF.format(
                    TWELVE_TF.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();
        }


        return str;
    }
    public static void main(String[] args)  {
        String time = "07:05:45PM";
       String dateConverted = timeConversion(time);
        System.out.println(dateConverted);

    }
}
