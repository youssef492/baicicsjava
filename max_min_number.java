package array;
import java.util.Scanner;
public class max_min_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter length from numbers : ");
        int x = in.nextInt();
        int arr[]  = new int[x];
        for (int i = 0; i < arr.length; i++) {
          System.out.println("enter numbers["+i+"] : ");
          arr[i] = in.nextInt();
        }
        int max = arr[0];
        for (int i : arr) {
          if(i>max){
            max = i;
          }
        }
        System.out.println("this maxmum : "+max);
        for (int i : arr) {
         if(i<max){
          max=i ;
         } 
        }
        System.out.println("this minmum : "+max);
}
}