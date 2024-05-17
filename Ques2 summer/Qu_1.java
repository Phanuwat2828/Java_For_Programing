
import java.util.*;

public class Qu_1 {
    int sumation(String txt) {

        int sum = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isDigit(txt.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(txt.charAt(i)));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        Qu_1 ob = new Qu_1();
        System.out.print(ob.sumation(input.nextLine()));
    }
}