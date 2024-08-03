package BasicQuestions;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : " );
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number : " );
        int n2 = sc.nextInt();

    // By using ternary operator
        String res = n1>n2 ?  n1 +"  is greater " :  n2 +" is greater";
        System.out.println(res);

    // By using if else condition
    // if(n1>n2){
    //     System.out.println(n1 + " is greater");
    // }
    // else if(n1<n2){
    //     System.out.println(n2 + " is greater");
    // }
    // else{
    //     System.out.println("Both are Equal");
    // }
    // if(n1 == n2 ){
    //     System.out.println("Both are equal");
    // }
    // else{
    //     int res = Math.max(n1 ,n2);
    //     System.out.println(res);

    // }
    }
}
