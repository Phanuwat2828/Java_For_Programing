package Ques_2_66;

import java.util.Scanner;

public class Qu_3 {
    String[] number_data(String txt) {
        String number_return[] = txt.split("[,/]");
        return number_return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Qu_3 ob = new Qu_3();
        System.out.print("Enter : ");
        String data_txt[] = ob.number_data(input.nextLine());
        int n = 2;
        for (int i = 0; i < data_txt.length; i++) {
            if (i == n) {
                System.out.println();
                n += 2;
            }
            System.out.print(data_txt[i] + "\t");
        }
    }
}
