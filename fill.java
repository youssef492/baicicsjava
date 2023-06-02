package array;

import java.util.Arrays;

public class fill {
    public static void main(String[] args) {
        int[] numbers = new int[5];
 Arrays.fill(numbers, 10);  //   بالرقم 10 array املا ال 
 System.out.println("Array filled with 10s: " +
Arrays.toString(numbers));
    }
}
