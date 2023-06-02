package array;
import java.util.Scanner;
public class avgfromarray {
  static int avg(int arr[] ){
   int  sum =0 ;
    for (int i = 0; i < arr.length; i++) {
    sum+=arr[i];
   }
    int avg = sum/arr.length;
    return avg ;
  }
    public static void main(String[]args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter number : ");
      int r = in.nextInt();
      int arr[] = new int[r];
      for (int i = 0; i < arr.length; i++) {
        arr[i]=in.nextInt();
      }
      int n = avg(arr);
      System.out.println("Average : "+n);
    }
}
