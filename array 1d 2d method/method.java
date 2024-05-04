import java.util.*;

public class method {

    // method
    static double method_1(int a, int b) {
        double sum = a + b;
        return sum;
    }

    double method_2(int a, int b) {
        int sum = a * b;
        return sum;
    }

    double method_2(String a, int v) {
        return 0;
    }

    public static void main(String[] args) {
        method op = new method();
        int num1 = 10, num2 = 12;
        double sum = op.method_2("kai", num2);
        Scanner input = new Scanner(System.in);
        System.out.println(sum);
    }

}
