
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;;
public class rirary {
    public static void main(String[] args){
        try{
            

            String path_file = "C:\\Users\\ITMSU\\Documents\\GitHub\\Java_For_Programing\\kai\\test.xls";
            FileInputStream file = new FileInputStream(path_file);
            Scanner input = new Scanner(new File(path_file));
            BufferedReader bfin = new BufferedReader(new FileReader(path_file));
            try{
               
                String data_in_txt = "";
                // for(;;){
                //     int test = file.read();
                //     if(test==-1){s
                //         break;
                //     }else{
                //         data_in_txt+= (char)test;
                //     }
                // }
                for(;;){
                    String data = bfin.readLine();
                    if(data==null){
                        break;
                    }else{
                        System.out.println(data);
                    }
                }
                // for(;input.hasNextInt();){
                //     System.out.print(input.nextInt());
                // }
            }catch(IOException e){
                System.out.print(e);
            }
        }catch(FileNotFoundException e){
            System.out.print(e);
        }

    }
}
