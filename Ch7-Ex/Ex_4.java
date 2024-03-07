
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_4 {
    String change_text(String text) {
        StringBuffer data_return = new StringBuffer();
        StringTokenizer data_change = new StringTokenizer(text);
        for (; data_change.hasMoreTokens();) {
            StringBuffer da = new StringBuffer();
            String data1 = data_change.nextToken();
            for (int i = 0; i < data1.length(); i++) {
                if (i > 0) {

                    da.append(Character.toLowerCase(data1.charAt(i)));
                } else {
                    da.append(Character.toUpperCase(data1.charAt(i)));
                }
            }
            data_return.append(da);
            data_return.append(" ");
        }
        return data_return.toString();
    }

    public static void main(String[] args) {
        Ex_4 ob = new Ex_4();
        System.out.print("Enter Text : ");
        Scanner ip_ = new Scanner(System.in);
        String text = ip_.nextLine();
        System.out.print(ob.change_text(text));

    }
}
