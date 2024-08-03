package BasicQuestions;
import java.util.Scanner;
// greatest of two numbers
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number one");
        int n1 = sc.nextInt();
        System.out.println("enter the number one");
        int n2 = sc.nextInt();
        if(n1==n2){
            System.out.println("both are equal");
        }
        
        else{
            int res = Math.max(n1,n2);
            System.out.println("the greatest number is "+res);
        }


    }
}
