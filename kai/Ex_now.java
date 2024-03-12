

import java.io.IOException;

public class Ex_now {
    public static void main(String[] args){
        String text = "";
        try{
            for(;;){
                int x = System.in.read();
                char c = (char)x;
                
                if(x==-1){
                    System.out.println(text);
                    break;
                }else{
                    text+=c;
                }
            }
        
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
