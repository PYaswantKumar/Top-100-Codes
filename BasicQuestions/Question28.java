package BasicQuestions;

import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 st number");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2 nd number");
        int n2 = sc.nextInt();
        int s1=0,s2=0;
        for(int i =1;i<=n1/2;i++){
            if(n1%i==0){
                s1=s1+i;
            }
        }
        for(int i =1;i<=n2/2;i++){
            if(n2%i==0){
                s2=s2+i;
            }
        }
        if(s1/n1==s2/n2){
            System.out.println("friendly pair");
        }else{
        System.out.println("Not an friendly pair");
        }
    }
}
