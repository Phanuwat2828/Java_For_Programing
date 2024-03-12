
// import 
import java.util.Scanner;

public class Ex_2 {
    String change_data(String data) {
        String change = new StringBuilder(data).reverse().toString();
        return change;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ex_2 ob = new Ex_2();
        System.out.print("Enter : ");
        String data = input.nextLine();
        String data_change = ob.change_data(data);
        if (data_change.equals(data)) {
            System.out.print(data + " Is Parindom");
        } else {
            System.out.print(data + " Is not Parindom");
        }
    }
}
