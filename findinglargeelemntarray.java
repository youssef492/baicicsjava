package array;
public class findinglargeelemntarray {
    public static void main(String []ards) {
        int arr[] = {800,20,90,100} ;
        int max = arr[0];
         
        for (int i =1;  i < arr.length ; i++) {
          if(arr[i]>max ) max=arr[i];
        }
       System.out.println(max);
    }
      
    }

