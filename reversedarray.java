package array;
import java.util.Scanner;
public class reversedarray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter number of elements : ");
         int num = in.nextInt();
         int arr[] = new int[num];  
         for (int i = 0; i < arr.length; i++) {
          arr[i]=in.nextInt();  // {1,2,3,4,5}
         }
         for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[num-i-1]+" "); 
         }
    }
}
