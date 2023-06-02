package excercises;
import java.util.Scanner;
public class search_items {
public static boolean serchingforitems(int arr[] , int size , int serchingforitems){
    boolean isfound =false ;
    for (int i = 0; i <size ; i++) {  // lengnth from array
        if(arr[i]==serchingforitems){
            isfound = true ;
        }
    }
    return isfound ;
    }
    public static void main(String[] args) {
      int numbers[] = {10,20,33,144,250,60}; 
      Scanner in = new Scanner(System.in);
      System.out.println("enter number please");
      int whicheitems = in.nextInt();
      if(serchingforitems(numbers, 6, whicheitems)){
        System.out.println("this item is found");
      }  else{
        System.out.println("this item is not found");
      }
    }
}
