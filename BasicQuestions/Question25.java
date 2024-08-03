package BasicQuestions;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int Sq=num * num;
        if(isAutomorphic(num,Sq)==1){
            System.out.println("Automorphic number");
        }else{
            System.out.println("Not an Automorphic number");
        }
    }
    static int isAutomorphic(int num,int Sq){
        while(num!=0){
            if(num%10 != Sq%10){
                return 0;
            }
            num/=10;
            Sq/=10;
        }
        return 1;
    }
}
