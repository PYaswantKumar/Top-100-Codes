package BasicQuestions;

import java.util.Scanner;

//Palindrome number
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int rev=0;
        
        
       
        if( isPalindrome(num,rev) == num){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
    static int isPalindrome(int n,int rev){
        if(n==0){
            return rev;
         }
         int rem = n % 10;
         rev = rev * 10 + rem;
    
         return isPalindrome (n / 10, rev);
        }
    
}
