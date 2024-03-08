import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class Ex_6 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd:EEEE:MMMM:yyyy \nuu:dd:DD\nkk:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println(formattedDate);
    }
}
