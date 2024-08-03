package BasicQuestions;

import java.util.Scanner;

// to check whether it is a prime or not
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check whether a number is prime or not");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
    public static boolean isPrime(int num){
        
            for(int i=2;i<num;i++){
                if(num%i==0){

                    return false;
                }
       
        
            }
            return true;
        
    }
    
  
}
