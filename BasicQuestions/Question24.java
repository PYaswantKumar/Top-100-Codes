package BasicQuestions;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        
            int sq = (int) Math.sqrt(n1);
            int res= (int) (sq * sq);
            if(res == n1){
                System.out.println("Perfect square");
            }
            else{
                System.out.println("Not a Perfect Square");
            }
        
        
    }
}
