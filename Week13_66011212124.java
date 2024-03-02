
import java.util.*;

public class Week13_66011212124 {
    String del(String data) {
        String data_del = "";
        for (int i = 0; i < data.length(); i++) {
            if (Character.isDigit(data.charAt(i))) {
                data_del += data.charAt(i);
            }
        }
        return data_del;
    }

    void number(String data) {
        int sum = 0;

        for (int i = 0; true; i++) {
            if (data.length() > 1) {
                if (i == 0) {
                    System.out.print(" -->");
                }
                sum += Integer.parseInt(Character.toString(data.charAt(i)));
                System.out.print(Integer.parseInt(Character.toString(data.charAt(i))) + "+");
                if (data.length() == i + 1) {
                    i = -1;
                    data = Integer.toString(sum);
                    System.out.print("\b=" + data);
                    sum = 0;
                }
            } else {
                break;
            }

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        String data = input.next();
        Week13_66011212124 md = new Week13_66011212124();
        // System.out.print(data.length());
        md.number(md.del(data));
    }
}