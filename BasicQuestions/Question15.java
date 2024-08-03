package BasicQuestions;

import java.util.Scanner;

//armstrong number in a given range
public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num 1");
        int n1 = sc.nextInt();
        System.out.println("enter the num 2");
        int n2 = sc.nextInt();
     
      
            for(int i=n1;i<=n2;i++){
                int len=order(i);
                int arm = getArmstrong(i,len);
                
            
            if(arm==i){
                System.out.println("armstrong number");
            }
        }
        
    }
    static int order(int num){
        int len =0;
        while(num!=0){
            num = num/10;
            len++;
        }
        return len;
    }
    static int getArmstrong(int num,int len){
        
        if(num==0){
        return 0;
        }
        else{
            
            int digit = num/10;
            return  (int)Math.pow(digit,len) +  getArmstrong(num/10, len);
        }
    }
}
