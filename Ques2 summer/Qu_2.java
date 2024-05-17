import java.util.Scanner;

public class Qu_2 {

    String process_txt(String data) {
        StringBuffer data_return = new StringBuffer();
        for (int i = 0; i < data.length(); i++) {
            if (i % 2 == 0) {
                data_return.append(Character.toUpperCase(data.charAt(i)));
            } else {
                data_return.append(Character.toLowerCase(data.charAt(i)));
            }
        }
        return data_return.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Qu_2 ob = new Qu_2();
        System.out.print("Enter : ");
        System.out.print(ob.process_txt(input.nextLine()));

    }

}
