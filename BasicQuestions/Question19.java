package BasicQuestions;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double num = sc.nextInt();
        System.out.println("Enter the power:");
        double po = sc.nextInt();
        // double res = Math.pow(num,po);;
        // System.out.println(res);
        double res=1;
       while(po!=0){
            res = res* num;
            po--;

        }
        System.out.println(res);
    }
}
