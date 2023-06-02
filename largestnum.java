package excercises;
import java.util.Scanner;
public class largestnum {
 public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter three number please :");
        int a =in.nextInt();
        int b = in.nextInt();
        int c =in.nextInt();
        int temp  ,largest;
        temp=(a>b)?a:b ;
        largest=(c>temp)?c:temp;
        System.out.println("the largestcnumber is "+largest);
    }
}
   

