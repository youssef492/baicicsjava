package array;
import java.util.Scanner;

public class searchoddeven {
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     System.out.println();
     int num = in.nextInt();
     int arr[] = new int[num];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=in.nextInt();
        if(arr[i]%2==0){
        System.out.println(arr[i]+" is even number ");
     }else {
        System.out.println(arr[i]+" is odd number");
     }
    } 

    }
}
