
import java.util.Scanner;

public class Qu_5 {

    
    double operator(String data){
        StringBuffer data_bf = new StringBuffer();
        // StringBuffer data_bf_1 = new StringBuffer();
        Integer num1=0,num2=0;
        char oporator = ' ';
        boolean status = false;
        double sum =0;
        String data_num[] = data.split("[*%/+-]");
        num1 = Integer.parseInt(data_num[0]);
        num2 = Integer.parseInt(data_num[1]);
        oporator = data.charAt(data_num[0].length());
        if(oporator=='+'){
            sum = num1+num2;
        }else if(oporator=='-'){
            sum = num1-num2;
        }else if(oporator=='/'){
            sum = num1/num2;
        }
        return sum;
    }
    public static void main(String[] args){
        Qu_5 ob = new Qu_5();
        System.out.print("Enter : ");
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        System.out.print( ob.operator(data));

    }
}
