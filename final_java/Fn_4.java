
import java.util.Scanner;
import java.io.File;
import java.util.StringTokenizer;
import java.util.HashMap;
public class Fn_4 {
    int posees(String[] num ,char operator,HashMap<String,String> dataMap){
        for(int i=0;i<num.length;i++){
            StringTokenizer data_number = new StringTokenizer(num[i]);
            StringBuffer word = new StringBuffer();
            while (data_number.hasMoreTokens()) {
                String data_next = data_number.nextToken().toLowerCase();
                word.append(dataMap.get(data_next));
            }
            System.out.print(word);
        }
        return 0;
    }
    public static void main(String[] args){
        try{
            Scanner input_str = new Scanner(System.in);
            Scanner input_char = new Scanner(System.in);
            Fn_4 ob = new Fn_4();
            String num[] = new String[2];
            HashMap<String,String> digitmap = new HashMap<String,String>();
            digitmap.put("zero","0");
            digitmap.put("one","1");
            digitmap.put("two","2");
            digitmap.put("three","3");
            digitmap.put("four","4");
            digitmap.put("five","5");
            digitmap.put("six","6");
            digitmap.put("seven","7");
            digitmap.put("eight","8");
            digitmap.put("nine","9");
            char operator;
            System.out.print("Enter number[1] : ");
            num[1] = input_str.nextLine();
            System.out.print("Enter Oprator : ");
            operator = input_char.next().charAt(0);
            System.out.print("Enter number[2] : ");
            num[1] = input_str.nextLine();
            ob.posees(num, operator, digitmap);
        }catch(Exception e){
            System.out.print(e);
        }
    }
}
