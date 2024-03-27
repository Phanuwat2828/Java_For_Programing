

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;


public class Fn_2 {
    static Fn_1 ob_1 = new Fn_1();
    HashMap<String,Integer> check_data(String dataString){
        StringTokenizer data_check = new StringTokenizer(dataString);
        ArrayList<String> data = new ArrayList<String>();
        HashMap<String,Integer> data_return = new HashMap<String,Integer>();
        for(;data_check.hasMoreTokens();){
            String data_loop = data_check.nextToken();
            if(data_loop.equals("stop")){
                break;
            }
            if(data.contains(data_loop)){
               data_return.replace(data_loop,data_return.get(data_loop)+1);
            }else{
                data.add(data_loop);
                data_return.put(data_loop,1);
            }
        }
        return data_return;
    }
    public static void main(String[] args){
        try{
            Fn_2 ob = new Fn_2();
            FileWriter file_data = new FileWriter(ob_1.path_name);
            Scanner read = new Scanner(new File(ob_1.path_name));
            HashMap<String,Integer> data_show = new HashMap<String,Integer>();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter : ");
            String data_str = input.nextLine();
            file_data.write(data_str);
            file_data.close();
            data_show = ob.check_data(read.nextLine());
            System.out.print("Animal : "+data_show.size()+"\n");
            for(String key:data_show.keySet()){
                System.out.print(key+"\t"+data_show.get(key)+"\n");
            }
        }catch(IOException e){
           System.out.print(e);
        }
    }
}
