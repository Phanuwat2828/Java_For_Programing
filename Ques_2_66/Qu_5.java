package Ques_2_66;

import java.util.Scanner;

public class Qu_5 {
    int process_number(String data) {
        String number_data[] = data.split("[+-/*%]");

        int index_data = 0, sum_return = Integer.parseInt(number_data[0]);
        for (int i = 0; i < number_data.length - 1; i++) {
            index_data += number_data[i].length();
            if (i != 0) {
                index_data += 1;
            }
            char operator = data.charAt(index_data);
            int num = Integer.parseInt(number_data[i + 1]);
            if (operator == '+') {
                sum_return += num;
            } else if (operator == '-') {
                sum_return -= num;
            } else if (operator == '*') {
                sum_return *= num;
            } else if (operator == '/' && num != 0) {
                sum_return /= num;
            } else if (operator == '%' && num != 0) {
                sum_return %= num;
            } else {
                continue;
            }
        }
        return sum_return;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Qu_5 ob = new Qu_5();
        System.out.print("Enter : ");
        System.out.print(ob.process_number(input.nextLine()));
    }
}
