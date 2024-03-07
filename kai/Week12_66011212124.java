package kai;

import java.util.*;
import java.util.StringTokenizer;
import java.util.Stack;

public class Week12_66011212124 {

    static boolean input_id() {
        String id = "";
        System.out.print("Enter : ");
        Scanner input = new Scanner(System.in);
        id = input.nextLine();
        return process(id);
    }

    static boolean process(String text) {
        int count_tap = 0;
        int count_space = 0;
        String[] process;
        String text_2 = text.replace('-', ' ');
        StringTokenizer st = new StringTokenizer(text_2);
        StringBuffer sb = new StringBuffer();
        for (; st.hasMoreTokens();) {
            String str = st.nextToken();
            sb.append(str);
        }

        if (sb.length() == 13) {
            return check_data_text(sb.toString());
        } else {
            return false;
        }
    }

    static boolean check_data_text(String data) {
        boolean status = false;
        for (int i = 0; i < 13; i++) {
            if (Character.isLetter(data.charAt(i))) {
                status = Character.isLetter(data.charAt(i));
                break;
            } else {
                status = false;
            }
        }
        if (status == true) {
            return false;
        } else {
            return process_number_1(data, Integer.parseInt(Character.toString(data.charAt(12))));
        }
    }

    static boolean process_number_1(String data_number, int final_number) {

        int sum[] = new int[12], round = 13;

        for (int i = 0; i < round - 1; i++) {
            sum[i] = (round - i) * (Integer.parseInt(Character.toString(data_number.charAt(i))));
        }
        return process_number_2(sum, final_number);
    }

    static boolean process_number_2(int[] data_number, int final_number) {

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += data_number[i];
        }
        return process_number_3(sum, final_number);
    }

    static boolean process_number_3(int sum, int final_number) {
        int mod = sum % 11;

        return process_number_4(mod, final_number);
    }

    static boolean process_number_4(int mod, int final_number) {
        int del = 11 - mod;

        return process_number_5(del, final_number);
    }

    static boolean process_number_5(int del, int final_number) {
        if (del > 9) {
            char num_1 = Integer.toString(del).charAt(1);
            int num_2 = Integer.parseInt(Character.toString(num_1));
            if (num_2 == final_number) {
                return true;
            } else {
                return false;
            }
        } else if (del >= 0) {
            if (del == final_number) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(input_id());
    }
}
