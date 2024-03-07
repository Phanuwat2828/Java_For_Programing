



// import 
import java.util.Scanner;

class Ex_1{
    
    boolean check_data(String number){
        boolean status = false;
        String text = "";
        for(int i=0;i<number.length();i++){
            if(Character.isDigit(number.charAt(i))){
                status=true;
            }else{
                status=false;
                break;
            }
        }
        return status;
    }
    String email(String number){
        String host = "";
        String componet[]  = number.split("@");
        host = componet[1];
        return host;
    }
    
    void Show_data(String number){
        Ex_1 object = new Ex_1();
        if(Character.isDigit(number.charAt(0)) && check_data(number)==true){
            System.out.print(number+"is Mobile phone number\n"+number+"is not Email");
        }else{
            System.out.print(number+"is not Email\n"+number+"is Mobile phone number\n"+object.email(number));
        }

    }
    
    public static void main(String[] args){
        Ex_1 object = new Ex_1();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter : ");
        String number = input.nextLine();
        object.Show_data(number);
       


    }
}