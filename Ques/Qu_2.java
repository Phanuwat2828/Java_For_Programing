

// import
import java.util.Scanner;

public class Qu_2 {
    String process(String data){
        StringBuffer data_return = new StringBuffer();
        for(int i=0;i<data.length();i++){
            if((i+1)%2!=0){
                data_return.append(Character.toUpperCase(data.charAt(i)));
            }else{
                data_return.append(data.charAt(i));
            }

        }
        return data_return.toString();

    }
    public static void main(String[] args){
        Qu_2 ob = new Qu_2();
        Scanner ip_ = new Scanner(System.in);
        System.out.print("Enter : ");
        String txt = ip_.nextLine();
        System.out.print(ob.process(txt));

    }
}
