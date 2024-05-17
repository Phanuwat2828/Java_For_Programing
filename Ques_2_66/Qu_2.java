package Ques_2_66;

import java.util.Scanner;

public class Qu_2 {
    String uper_txt(String txt) {
        StringBuffer data_return = new StringBuffer();
        for (int i = 0; i < txt.length(); i++) {
            if ((i + 1) % 2 != 0) {
                data_return.append(String.valueOf(txt.charAt(i)).toUpperCase());
            } else {
                data_return.append(String.valueOf(txt.charAt(i)).toLowerCase());
            }
        }
        return data_return.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Qu_2 ob = new Qu_2();
        System.out.print("Enter : ");
        System.out.print(ob.uper_txt(input.nextLine()));
    }
}
