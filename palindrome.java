package excercises;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number please : ");
        int num =in.nextInt();
        int  reverse =0;
        int n = num;
        while(num>0){
            int digit = num%10;
            reverse=reverse*10 + digit;
            num /= 10;
        }
        if(reverse == n){
            System.out.println("is a palindrome");
        }else
        System.out.println("is not a palindrome");
    }
}
