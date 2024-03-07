
// import 

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_3 {
    String none_tap(String data) {
        int count[] = { 0 };
        StringTokenizer Stk = new StringTokenizer(data);
        StringBuffer data_all = new StringBuffer();

        for (; Stk.hasMoreTokens();) {
            data_all.append(Stk.nextToken());
        }
        return data_all.toString();
    }

    int[] count_text(String data) {
        int count[] = new int[3];
        for (int i = 0; i < data.length(); i++) {
            if (Character.isUpperCase(data.charAt(i))) {
                count[0] += 1;
            } else if (Character.isLowerCase(data.charAt(i))) {
                count[1] += 1;
            } else if (Character.isDigit(data.charAt(i))) {
                count[2] += 1;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Ex_3 ob = new Ex_3();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        String data_text = input.nextLine();
        String data = ob.none_tap(data_text);
        int data_count[] = ob.count_text(data);
        System.out.print(data_count[2] + " number\n" + data_count[1] + " Lowercase\n" + data_count[0] + " Uppercase\n");

    }
}
