
import java.util.Scanner;
import java.util.Stack;
public class Week14_66011212124 {
    Stack<Integer> data(){
        Stack <Integer>data_of_stack = new Stack<Integer>();
        try{
            System.out.println("Count number:");
            Scanner input = new Scanner(System.in);
            int count_data = input.nextInt();
            for(int i = 0; i < count_data; i++){
                System.out.println("number:");
                int input_data = input.nextInt();
                data_of_stack.push(input_data);
            }
            return data_of_stack;
        }catch(Exception e){
            return data_of_stack;
        }
    }
    void show_data(Stack<Integer> data_of_stack){
      
        for(int i = 0;data_of_stack.empty()!=true ; i++){
            Integer data_view = data_of_stack.peek();
            System.out.println(data_view);
            data_of_stack.pop();
        }
    }
    public static void main(String[] args){
        Week14_66011212124 md = new Week14_66011212124();
        Stack <Integer>data_of_stack_1 = new Stack<Integer>();
        Stack <Integer>data_of_stack = new Stack<Integer>();
        Stack <Integer>data_of = new Stack<Integer>();
        for(;true;){
            try{
                System.out.print("(1) Input Data\n(2) Show Data\n(3) Exit Program\nEnter Number: ");
                Scanner input = new Scanner(System.in);
                int type = input.nextInt();
                if(type == 1){
                    data_of_stack_1= md.data();
                    for(;data_of_stack_1.empty()!=true ;){
                        Integer data_view = data_of_stack_1.peek();
                        data_of_stack.push(data_view);
                        data_of_stack_1.pop();
                    }
                    for(;data_of_stack.empty()!=true ;){
                        Integer data_view = data_of_stack.peek();
                        data_of.push(data_view);
                        data_of_stack.pop();
                    }

                }else if(type == 2){
                    md.show_data(data_of);
                }else if(type == 3){
                    break;
                }
            }catch(Exception e){
                System.out.println("\n========================= Enter Again ======================\n");
                continue;
            }
        }
    }
}
