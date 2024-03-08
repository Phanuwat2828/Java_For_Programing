
import java.util.Scanner;

public class Qu_6 {
    boolean change_data(String data) {
        return data.charAt(0) == data.charAt(data.length() - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter :");
        String data = input.nextLine();
        Qu_6 ob = new Qu_6();
        System.out.print(ob.change_data(data));
    }
}
