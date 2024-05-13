
import java.util.Scanner;
import java.util.StringTokenizer;

public class Qu_3 {

    void domain_lenght(String data) {
        int k = 2;
        String data_pro[] = data.split("[,/]");

        for (int i = 0; i < data_pro.length; i++) {
            if (i == k) {
                System.out.println();
                k += 2;
            }
            System.out.print(data_pro[i] + "\t");

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        String data = input.nextLine();
        Qu_3 ob = new Qu_3();
        ob.domain_lenght(data);
    }
}
