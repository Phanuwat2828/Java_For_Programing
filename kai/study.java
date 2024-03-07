import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class study {
    public static void main(String[] args) throws ParseException {
        // Create a SimpleDateFormat instance with a date pattern
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Format a Date object into a string
        Date currentDate = new Date();
        String formattedDate = sdf.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

        // Parse a string into a Date object
        String dateString = "2024-03-15 08:30:00";
        Date parsedDate = sdf.parse(dateString);
        System.out.println("Parsed Date: " + parsedDate);
    }
}
