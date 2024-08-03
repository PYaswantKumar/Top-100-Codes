package BasicQuestions;
import java.util.Scanner;;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1  : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the num 2  : ");
        int n2 = sc.nextInt();
    //     int result = 0;
    //     for(int i=n1;i<=n2;i++){
    //        result = result + i;
           
    //     }
    //     System.out.println("Sum of numbers between range are  : " + result);
      int result = getSum(0,n1,n2);
      System.out.println("Sum of numbers are " + result);
     }
     static int getSum(int sum , int n1, int n2){
        if(n1>n2){
            return sum;
        }
        else{
            sum = sum + n1;
            return getSum(sum,n1+1,n2);
        }

     }
        
     
}
