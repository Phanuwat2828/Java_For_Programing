import java.util.Scanner;

public class Qu_5 {
    int process_num(String txt) {

        txt = txt.replace("/0", "");
        txt = txt.replace("%0", "");
        String data_num[] = txt.split("[+-/*%]");
        int index = 0;
        int data_return = Integer.parseInt(data_num[0]);
        for (int i = 0; i < data_num.length - 1; i++) {
            index += data_num[i].length();
            if (i != 0) {
                index += 1;
            }
            char operator = txt.charAt(index);
            int num = Integer.parseInt(data_num[i + 1]);
            if (operator == '+') {
                data_return += num;
            } else if (operator == '-') {
                data_return -= num;
            } else if (operator == '*') {
                data_return *= num;
            } else if (operator == '/') {
                data_return /= num;
            } else if (operator == '%') {
                data_return %= num;
            }
        }
        return data_return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Qu_5 ob = new Qu_5();
        System.out.print("Enter : ");
        System.out.print(ob.process_num(input.nextLine()));
    }
}
