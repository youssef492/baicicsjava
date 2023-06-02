package array;

import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,56,5,7,8};
        int key =10 ;
        int index =Arrays.binarySearch(arr,key);  // key ال arr شوف في ال 
        System.out.println("the key = "+key+" , the index key in array = "+index);
    }
}
