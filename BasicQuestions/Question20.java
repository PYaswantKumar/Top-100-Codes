package BasicQuestions;
import java.util.Scanner;
public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find factorial");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + "are :");
        for(int i=1;i<=10;i++){
            if(num%i==0){
                System.out.print(i+ " ");

            }
           
        }

    }
}
