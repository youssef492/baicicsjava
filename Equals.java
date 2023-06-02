package array;
import java.util.Arrays;
public class Equals {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 2, 3 };
        int[] array3 = { 1, 2, 4 };
        boolean equal1 = Arrays.equals(array1, array2); 
        boolean equal2 = Arrays.equals(array1, array3);
        System.out.println("Are array1 and array2 equal? " + equal1);
        System.out.println("Are array1 and array3 equal? " + equal2);
        }
}
