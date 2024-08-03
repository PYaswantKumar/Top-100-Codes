package BasicQuestions;

import java.util.Scanner;

public class Question22 {

    public static boolean StrongNumber(int num){
        boolean flag = false;
        int temp = num;
        int digit,sum=0;
        while(temp!=0){
          digit = temp % 10;
          sum=sum+fact(digit);
          temp = temp /10;
        }
          if(num==sum){
            flag = true;
          }else{
            flag = false;
          }
          return flag;


        
    }
    public static int fact(int digit){
        int fac=1;
        for(int i=1;i<=digit;i++){
            fac = fac * i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a number to find strong number or not ? ");
        int n= sc.nextInt();
        if(StrongNumber(n)){
            System.out.println(n + "is  a  strong number ");
        }else{
            System.out.println(n + "is not  a  strong number ");
        }

    }
}
