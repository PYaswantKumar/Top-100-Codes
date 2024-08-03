package BasicQuestions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //using bitwise operator
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to check whether it is positive or negative");
        int num = sc.nextInt();
       if(isEven(num)){
        System.out.println("the number is positive");
       }
       else{
        System.out.println("the number is negative");
       }
    }
     static boolean isEven(int n1){
        if((n1 &1) == 0)
        return true;
        
        else
            return false;
        
    }
    
}
