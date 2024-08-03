package BasicQuestions;

import java.util.Scanner;

public class Question17 {
   static int a =0,b=1,nextTerm;
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for (int i = 2; i < num; i++)
        {
       nextTerm = a + b;
       a = b;
           b = nextTerm;
           System.out.print (nextTerm + " , ");
        }
 
    }
    
}
