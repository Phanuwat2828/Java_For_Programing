
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex_5 {
    String reverse_word(String text) {
        StringTokenizer data_text = new StringTokenizer(text);
        Stack<String> data_rv = new Stack<String>();
        StringBuffer data_return = new StringBuffer();
        for (; data_text.hasMoreTokens();) {
            String data = data_text.nextToken();
            data_rv.push(" ");
            data_rv.push(data);
        }
        for (; data_rv.empty() != true;) {
            String tets = data_rv.peek();
            // System.out.print(tets);
            data_return.append(data_rv.peek());
            data_rv.pop();
        }
        return data_return.toString();
    }

    String revers_text(String data) {
        StringTokenizer data_text = new StringTokenizer(data);
        StringBuffer data_return = new StringBuffer();
        for (; data_text.hasMoreTokens();) {
            String data_pro = data_text.nextToken();
            data_return.append(data_pro.charAt(data_pro.length() - 1) + data_pro.substring(1, data_pro.length() - 1)
                    + data_pro.charAt(0));
            data_return.append(" ");
        }
        return data_return.toString();
    }

    public static void main(String[] args) {

        Ex_5 ob = new Ex_5();
        Scanner ip_ = new Scanner(System.in);
        System.out.print("Enter : ");
        String data_text = ip_.nextLine();
        System.out.print(ob.revers_text(ob.reverse_word(data_text)));

    }
}
