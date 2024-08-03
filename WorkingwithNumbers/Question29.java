package WorkingwithNumbers;

import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd Number");
        int n2 = sc.nextInt();
        int hcf =0;
        for(int i=1;i<=n1 || i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                hcf =i;
            }
        }
        System.out.println(hcf);
    }
    
}
