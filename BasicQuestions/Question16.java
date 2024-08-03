package BasicQuestions;

import java.util.Scanner;



//fibonaci series
public class Question16 {
    static int a =0,b=1,c;
    public static int fb(int num){
        if(num<0){
            return 0;
        }else{
            c = a+ b;

            System.out.print(" "+ c);
            a = b;
            b = c;
            return fb(num-1);


        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
       
        System.out.print(a + " " + b);
       
        fb(num-2);
        


    }
   
    
}
