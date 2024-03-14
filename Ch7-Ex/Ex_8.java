
import java.util.Scanner;;

public class Ex_8 {

    double operator(String data) {
        String data_split[] = data.split("[%*-+/]");
        char operator[] = new char[data_split.length - 1];
        int len = 0;
        for (int i = 0; i < data_split.length - 1; i++) {
            if (i == 0) {
                len += data_split[i].length();
                operator[i] = data.charAt(len);
            } else {
                len += data_split[i].length() + 1;
                operator[i] = data.charAt(len);
            }
        }
        double sum = Integer.parseInt(data_split[0]);
        for (int i = 1; i < operator.length + 1; i++) {
            int operant = Integer.parseInt(data_split[i]);
            if (operator[i - 1] == '-') {
                sum -= operant;
            } else if (operator[i - 1] == '+') {
                sum += operant;
            } else if (operator[i - 1] == '/' && operant != 0) {
                sum /= operant;
            } else if (operator[i - 1] == '*') {
                sum *= operant;
            } else if (operator[i - 1] == '%' && operant != 0) {
                sum %= operant;
            } else {
                continue;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ex_8 oop = new Ex_8();
        System.out.print("Enter : ");
        String data = input.nextLine();
        System.out.print(oop.operator(data));

    }
}
