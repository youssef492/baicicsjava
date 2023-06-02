package excercises;
import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("please enter number: ");
        int f =in.nextInt()  , f2=1 ; 
    for (int i = 1; i <=f ; i++) {
        f2*=i;  
    }
    System.out.println("the factorial from "+"["+f+"]"+" = "+f2);
    }
}
