package Ques_2_66;

import java.util.Scanner;

public class Qu_1 {
    int process_data(String data_txt) {
        int number_return = 0;
        for (int i = 0; i < data_txt.length(); i++) {
            if (Character.isDigit(data_txt.charAt(i))) {
                number_return += Integer.parseInt(String.valueOf(data_txt.charAt(i)));
            } else {

            }

        }
        return number_return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Qu_1 ob = new Qu_1();
        System.out.print("Enter : ");
        String data = input.nextLine();
        System.out.print(ob.process_data(data));

    }
}
