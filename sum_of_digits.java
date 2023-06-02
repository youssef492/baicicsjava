package excercises;
import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[]args) {
       for (int i = 0; i <=2000000000; i++) {
        System.out.println("enter number : ");Scanner in = new Scanner(System.in);
        long num= in.nextInt(),sum=0 ;
        for (long n = num; n >0; n=n/10) {
            sum=sum+n%10;
        }
        System.out.println("sum of digits = "+sum);
       }
    }
}
