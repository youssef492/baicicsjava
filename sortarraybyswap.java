package array;
    // sort(ترتب) the array list "مهمه جداااااااااااااااااا"
import java.util.Arrays;
public class sortarraybyswap {
    public static void main(String[] aStrings) {
        int[] arr = {5, 2, 8, 3, 1, 6};   
        bubbleSort(arr);
 System.out.println(Arrays.toString(arr));  // Arrays--->class   ;;;   toString--->method to Arrays class
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;  //6
        for (int i = 0; i < n - 1; i++) {     // هتفضل تقارن ال العناصر حتي العنصر القبل الاخير علشان كده ضفنا -1        
            for (int j = 0; j < n - i - 1; j++) {    
        if (arr[j] > arr[j + 1]) {  // swap step   تبديل الارقام
        int temp = arr[j];    //swap step
        arr[j] = arr[j + 1]; //swap step
        arr[j + 1] = temp;   //swap step
        }
        }
        }
}
}