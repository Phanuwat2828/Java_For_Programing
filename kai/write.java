
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class write {
    public static void main(String[] args){
        try{
            String path_file = "C:\\Users\\ITMSU\\Documents\\GitHub\\Java_For_Programing\\test_txt.doc";
            Scanner input = new Scanner(System.in);
            // FileOutputStream write = new FileOutputStream(path_file,true);
            PrintWriter wt =  new PrintWriter(new BufferedWriter(new FileWriter(path_file)));
            for(;;){

                String x = input.nextLine();
                if(x.equals("x")){
                    break;
                }
                wt.write(x);
            }
            wt.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
