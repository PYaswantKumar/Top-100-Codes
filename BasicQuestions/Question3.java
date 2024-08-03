package BasicQuestions;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check upto Natural  numbers");
        int n = sc.nextInt();
        //USING OWN LOGIC
        // int sum =0;
        //     if(n ==1){
        //         System.out.println(" It is not a natural number");
        //     }
        //     else{
        //         for(int i =1 ;i<=n;i++){
        //           sum += i;  
                


        //         }
        //         System.out.println("sum of natural numbers are" + sum);
        //     }

        // using recursion
      int result = getSum(n);
      System.out.println(result);
         }
         static int getSum(int n1){
            if(n1==0)
            return n1;

            return n1 + getSum(n1-1);
         }
    
    
}
