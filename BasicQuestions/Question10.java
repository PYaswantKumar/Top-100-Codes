package BasicQuestions;

import java.util.Scanner;

//Prime number within a given range
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int n1 = sc.nextInt();
        System.out.println("Enter the num 2");
        int n2 = sc.nextInt();
       for (int i = n1; i <= n2; i++) {
        if(isPrime(i)){
            System.out.println("Prime numbers are "+ i);
        }
       
       }
}
static boolean isPrime(int i){
    for (int j = 2; j < i; j++) {
        if (i % j == 0) {
            return false;
         }
    } 
    return true;
}
}


