package BasicQuestions;

import java.util.Scanner;

public class Question7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number one ");
    int n1 = sc.nextInt();
    System.out.println("Enter the number two ");
    int n2 = sc.nextInt();
    System.out.println("Enter the number three ");
    int n3 = sc.nextInt();

     int temp, result;    
    
    
    temp = n1>n2 ? n1:n2;
    
  
    result = temp>n3 ? temp:n3;  
    System.out.println (result + " is the greatest");
  }



    
}
