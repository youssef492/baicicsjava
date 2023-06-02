package array;
import java.util.Scanner;
public class reverswithmethod {
   static int rev(int[] arr  , int num){
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[num-i-1]+" "); 
      }
      System.out.println(); System.out.println("the number---------- ");
     return num;
   }
    public static void main(String[]args) {
       Scanner in = new Scanner(System.in);
       System.out.println("enter number of elements : ");
       int num2 = in.nextInt();
        int x[] = new int[num2];
        for (int i = 0; i < x.length; i++) {
         x[i] = in.nextInt();   
        }
        System.out.println(rev(x, num2));
    }
}
