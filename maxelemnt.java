package array;

public class maxelemnt {
    public static void main(String[] args) {
        int arr[][] ={
            {2,3,4,5,5},
            {5,5,5},
            {5}
        };
        int max = arr[0][0];
        for (int[] row : arr) {
          for (int element : row) {
            if(element>max){
                max=element ;
            }
          }  
        }System.out.println(max);
    }
}
