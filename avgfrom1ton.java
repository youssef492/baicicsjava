package excercises;
import java.util.Scanner;

public class avgfrom1ton {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter num : ");
        int num =in.nextInt(), sum =0 ,avg;
        for (int i = 1; i <= num; i++) { 
            sum+=i;
        }
        avg=sum/num;
        System.out.println("the avreage : "+avg); 
    }
}
