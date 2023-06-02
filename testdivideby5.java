package array;
import java.util.Scanner;

public class testdivideby5 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("enter numbers of arrays : ");
     int num = in.nextInt();
     int arr[] =new int[num];
     int u = 0 ;
     for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
        if(arr[i]%5 == 0){
        System.out.println(arr[i]+" is can divide by 5");
        u+=arr[i];
       } 
     }System.out.println("sum of numbers = "+u);
    }
}

