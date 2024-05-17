import java.util.Scanner;

public class Qu_6 {

    boolean lek_zap(String data) {
        return Character.toLowerCase(data.charAt(0)) == Character.toLowerCase(data.charAt(data.length() - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Qu_6 ob = new Qu_6();
        System.out.print("Enter : ");
        System.out.print(ob.lek_zap(input.nextLine()));
    }
}
