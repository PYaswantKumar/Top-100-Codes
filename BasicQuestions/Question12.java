package BasicQuestions;

import java.util.Scanner;

//Reverse of a number
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int rev=0;
        // while(num!=0){
        //     rem = num %10;
        //     rev = rev *10 + rem;
        //     num = num/10;
            

        // }
        // System.out.println(rev);
        System.out.println("reversed number is : " + isReverse(num,rev));
    }
    static int isReverse(int num,int rev){
    if(num==0){
        return rev;
     }
     int rem = num % 10;
     rev = rev * 10 + rem;

     return isReverse (num / 10, rev);
    }
   
}
