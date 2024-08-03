package BasicQuestions;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial : ");
        int num =sc.nextInt();
        int fac=1;
        for(int i =1;i<=num;i++){
            fac=fac*i;
        }
        System.out.println(fac);

    }
}
