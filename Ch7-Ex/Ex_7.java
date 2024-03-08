
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_7 {
    String number_change1(double data) {
        DecimalFormat dm = new DecimalFormat("##,###.#");

        return dm.format(data);
    }

    String number_change2(double data) {
        DecimalFormat dm = new DecimalFormat("##,###.###");

        return dm.format(data);
    }

    String number_change3(double data) {
        DecimalFormat dm = new DecimalFormat("##,####.##");

        return dm.format(data);
    }

    String number_change4(double data) {
        DecimalFormat dm = new DecimalFormat("##,##.#####");

        return dm.format(data);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        double data = input.nextDouble();
        Ex_7 ob = new Ex_7();
        System.out.print(ob.number_change1(data) + "\n");
        System.out.print(ob.number_change2(data) + "\n");
        System.out.print(ob.number_change3(data) + "\n");
        System.out.print(ob.number_change4(data) + "\n");
    }
}
