package excercises;
import java.util.Scanner;
public class neonnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number :  ");
        int num  = in.nextInt() ,sum=0;
        int square = num * num ;  // 81
        while(square!=0){   // هتلف مرتين
            int digit = square % 10 ; // digit =1   
            sum = sum + digit;  //  sum = 1
           square = square/10; // 8 
            System.out.println(sum);
       System.out.println(square);
        }
       
        if(num==sum)
        System.out.println(num+" is a neon number ");
        else 
        System.out.println(num+" is not a neon number ");
    }
}
