import java.util.Scanner;
import java.util.StringTokenizer;

public class Qu_4 {

    String process(String data) {
        StringBuffer data_return = new StringBuffer();
        StringTokenizer data_token = new StringTokenizer(data);
        for (; data_token.hasMoreTokens();) {
            String data_word = data_token.nextToken();
            for (int i = 0; i < data_word.length(); i++) {
                int number = 0;
                number = (int) data_word.charAt(i);
                data_return.append(Integer.toString(number));
            }
            data_return.append("+");
        }
        return data_return.toString();
    }

    public static void main(String[] args) {
        Qu_4 ob = new Qu_4();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        String data = input.nextLine();
        System.out.print(ob.process(data) + "\b ");
    }
}
