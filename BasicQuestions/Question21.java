package BasicQuestions;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number");
        int num = sc.nextInt();
        Primefactor(num);
    }
    public static int isPrime(int num){
        for(int i =2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return 0;
            }
            
        }
        return 1;
    }
        public static void Primefactor(int num){
            for(int i =2;i<=num;i++){
                if(isPrime(i)==1){
                    int x =num;
                    while(x%i==0){
                        System.out.print(i + " ");
                        x = x/i;
                    }
                }

            }
            
        }
    }

