package array;
import java.util.Scanner;
public class copyarray {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numOfElements = in.nextInt();
        int[] arr1 = new int[numOfElements] , arr2 = new int[numOfElements];
        for (int i = 0; i < numOfElements; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < numOfElements ; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("New array");
        for (int i = 0; i < numOfElements ; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
