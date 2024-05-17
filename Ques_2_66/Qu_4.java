package Ques_2_66;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Qu_4 {
    String process(String txt) {
        StringTokenizer tk = new StringTokenizer(txt);
        StringBuffer bf = new StringBuffer();
        for (; tk.hasMoreTokens();) {
            String word = tk.nextToken();
            for (int i = 0; i < word.length(); i++) {
                int num = word.charAt(i);
                bf.append(Integer.toString(num));
            }
            bf.append("+");
        }
        return bf.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Qu_4 ob = new Qu_4();
        System.out.print("Enter : ");
        System.out.print(ob.process(input.nextLine()) + "\b ");
    }
}
