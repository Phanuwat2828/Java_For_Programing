
import java.util.Scanner;

public class Qu_1 {
    int plus_number(String data_txt){
        int sum=0;
        for(int i=0;i<data_txt.length();i++){
            char data_ = data_txt.charAt(i);
            if(Character.isDigit(data_)){
                sum+=Integer.parseInt(String.valueOf(data_));
            }else{
                continue;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner ip_ = new Scanner(System.in);
        Qu_1 ob = new Qu_1();
        System.out.print("Enter : ");
        String txt = ip_.nextLine();
        System.out.print(ob.plus_number(txt));
    }
}
