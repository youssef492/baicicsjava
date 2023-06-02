package array;

import java.util.Arrays;

public class copyOf {
    public static void main(String[] args) { 
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] copy = Arrays.copyOf(numbers, 3);  // اطبع حتي الرقم 3
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Copied array: " + Arrays.toString(copy));
       
}
}