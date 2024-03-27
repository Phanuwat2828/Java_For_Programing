

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class Fn_3 {
    public String path_name = "Fn_data_3.txt";
    static Fn_3 ob= new Fn_3();
    int[] data_count()throws FileNotFoundException{
        int count[] = new int[4];
        Scanner read = new Scanner(new File(ob.path_name));
        while (read.hasNextLine()) {
            String data_line = read.nextLine();
            for(int i=0;i<data_line.length();i++){
                if(Character.isUpperCase(data_line.charAt(i))){
                    count[0]+=1;
                }else if(Character.isLowerCase(data_line.charAt(i))){
                    count[1]+=1;
                }else if(Character.isDigit(data_line.charAt(i))){
                    count[2]+=1;
                }
            }
            count[3]+=1;
        }
        return count;

    }


    public static void main(String[] args){
        // FileWriter writer = new FileWriter(ob_1.path_name);
        try{
            int data_count[] = new int[4];
            data_count=ob.data_count();
            System.out.print(data_count[0]+" Upper Case\n"+data_count[1]+" Lower Case\n"+data_count[2]+" Digit\n"+data_count[3]+" Line\n");

        }catch(FileNotFoundException e){

        }
       


    }
}
