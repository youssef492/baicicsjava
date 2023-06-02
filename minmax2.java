package array;
import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class minmax2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        Integer arr[] = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
          System.out.println("enter numbers["+i+"] : " );
            arr[i] =in.nextInt(); 
        } 
        int max = (int) Collections.max(Arrays.asList(arr));
        int min =(int) Collections.min(Arrays.asList(arr));
        System.out.println(max);
        System.out.println(min);
        
    }
}
