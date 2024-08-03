package BasicQuestions;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        
        if (num == 0) {
            System.out.println("Not a Harshad Number"); // Edge case: division by zero
            return;
        }
        
        int sum = 0, rev, temp = num;
        
        // Calculate the sum of the digits
        while (temp != 0) {
            rev = temp % 10;
            sum = sum + rev;
            temp = temp / 10;
        }
        
        // Check if the number is divisible by the sum of its digits
        if (num % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
        
        sc.close();
    }
}
