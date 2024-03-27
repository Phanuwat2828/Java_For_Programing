import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;


public class Fn_1 {
    public String path_name ="data.txt";
    private static Fn_1 ob = new Fn_1();
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
        // try{
            try {
                // Fn_1 ob = new Fn_1();
                FileWriter file_data = new FileWriter(ob.path_name);
                BufferedReader data_change = new BufferedReader(new FileReader(ob.path_name));
                Scanner input = new Scanner(System.in);
                Scanner read = new Scanner(new File(ob.path_name));
                System.out.print("Enter : ");
                String data = input.nextLine();
                file_data.write(data);
               
                file_data.close();
                System.out.print(ob.process(read.nextLine()) + "\b ");
            } catch (IOException e) {
                System.out.print(e);
            }
        // }catch(FileNotFoundException e){
        //     System.out.print(e);
        // }

    }
}