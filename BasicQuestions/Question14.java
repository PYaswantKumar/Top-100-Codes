package BasicQuestions;

import java.util.Scanner;

//Armstrong number
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        
        int len = length(temp);
       
        if(isArmstrong(num,len)==temp){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
    static int length(int num){
        int len =0;
        while(num!=0){
            num = num/10;
            len++;
        }
        return len;
    }
    static int isArmstrong(int num,int len){
      int digit;
      if(num==0){
        return 0;
      }
      else{
        digit = num %10;
        return (int)Math.pow(digit,len) + isArmstrong(num/10,len);
      }
        
    }
}
