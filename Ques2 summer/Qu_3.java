import java.util.Scanner;

public class Qu_3 {

    String[] process_number(String txt) {
        return txt.split("[,/]");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Qu_3 ob = new Qu_3();
        System.out.print("Enter : ");
        String data_[] = ob.process_number(input.nextLine());
        int n = 2;
        for (int i = 0; i < data_.length; i++) {
            if ((i) == n) {
                System.out.println();
                n += 2;
            }
            System.out.print(data_[i] + "\t");
        }
    }
}
