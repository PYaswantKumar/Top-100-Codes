//To check whether a number is positive or negative

 package BasicQuestions;

import java.util.Scanner;

public class Question1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is positive or negative : ");
    byte num = sc.nextByte();
    //using own logic
    // if(num>0)
    //     System.out.println("The number is positive");
    // else
    // System.out.println("The number is negative");

   // using ternary operator
     if(num==0){
     System.out.println("the number is neither positive nor negative it is zero");
     }
     else{
     String str = num <0 ? "The number is negative" : "The number is positive";
     System.out.println(str);
     }

 }
     
}