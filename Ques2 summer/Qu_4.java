import java.util.Scanner;

public class Qu_4 {
    String lek(String txt) {
        String data[] = txt.split("[ ]");
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length(); j++) {
                int num = data[i].charAt(j);
                bf.append(String.valueOf(num));
            }
            bf.append("+");
        }
        return bf.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Qu_4 ob = new Qu_4();
        System.out.print("Enter : ");
        System.out.print(ob.lek(input.nextLine()) + "\b ");

    }
}
