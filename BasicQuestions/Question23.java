package BasicQuestions;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fact =0,temp=n;
        for(int i =1;i<=temp/2;i++){
            if(temp%i==0){
                fact = fact + i;
            }
        }
        if(fact == n){
          System.out.println("it is a Perfect Number");
        }else{
            System.out.println("it is not a Perfect Number");
        }
    }


}
