package array;

import java.util.Arrays;

public class swaparray {
    public static void main(String []args ) {
        int []arr1 ={1,2,3,4,5};
        int []arr2 ={2,5,3,5,6};
        System.out.println("array1"+Arrays.toString(arr1));
        System.out.println("array2"+Arrays.toString(arr2));
        int[] temp =arr1;
        arr1=arr2;
        temp = arr2;
        System.out.println("array1"+Arrays.toString(arr1));
        System.out.println("array2"+Arrays.toString(arr2));
    }
}
