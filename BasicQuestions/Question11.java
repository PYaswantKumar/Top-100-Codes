package BasicQuestions;

import java.util.Scanner;

//Sum of digits of a number
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum =0;
        
        
            System.out.println("Sum of digits of a number is: "+ isSum(num,sum));
        
       
    }
    static int isSum(int num , int sum){
        if(num==0){
            return num;
        }
        return (num%10) + isSum(num/10,sum);
    }

    
}
