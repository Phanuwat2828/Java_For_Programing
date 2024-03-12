
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
class Week15_66011212124 {
    String grade_found(int data){
        String grade ="";
        if(data>=80){
            grade = "A";
        }else if(data>=70){
            grade = "B";
        }else if(data>=60){
            grade = "C";
        }else if(data>=50){
            grade = "D";
        }else if(data<50){
            grade = "F";
        }
        return grade;
    }
    public static void main(String[] args){
        Week15_66011212124  ob = new Week15_66011212124();
        // try{
            String name = "test.xls";
            Scanner input = new Scanner(System.in);
            Scanner input_2 = new Scanner(System.in);
            try{
                FileWriter wr_xls = new FileWriter(name);
                wr_xls.write("Code\tName\tMidtearm\tFinal\tScore\tGrade\n");
                for(;;){

                    int mid,final_,id;
                    String name_="",code;
                    System.out.print("Id : ");
                    code = input.nextLine();
                    System.out.print("Mid : ");
                    mid = input.nextInt();
                    System.out.print("Final : ");
                    final_ = input.nextInt();
                    System.out.print("Name : ");
                    name_ = input_2.nextLine();
                    int sum = mid+final_;
                    wr_xls.write(String.valueOf(code)+"\t"+name_+"\t"+String.valueOf(mid)+"\t"+String.valueOf(final_)+"\t"+String.valueOf(sum)+"\t"+ob.grade_found(sum));
                    if(code.charAt(0) =='0'){
                        break;
                    }
                }
                wr_xls.close();
            }catch(IOException e){

                System.out.println(e);
            }
    }
}
