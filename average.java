package excercises ;
import java.util.Scanner;
public class average {
    public static void main(String []ufd) {
         Scanner in = new Scanner(System.in);
         System.out.println("numbers to get the average ");
         double n = in.nextInt();
         double sum=0;
         for (int i = 1; i <n; i++) {
           System.out.println("enter number"+"["+i+"]");
            int num =in.nextInt();
           sum+=num;
         }
         double avg = (sum/n);
         System.out.println("sum of elements = "+sum+" , the average = "+avg);
    }
}
