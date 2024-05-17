package Ques_2_66;

import java.util.Scanner;

public class Qu_6 {
    boolean check_font_last(String txt) {
        char font = txt.charAt(0);
        char last = txt.charAt(txt.length() - 1);
        return Character.toLowerCase(font) == Character.toLowerCase(last);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Qu_6 ob = new Qu_6();
        System.out.print("Enter : ");
        System.out.print(ob.check_font_last(input.nextLine()));
    }
}
