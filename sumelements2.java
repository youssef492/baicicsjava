package array;
public class sumelements2 {
    public static void main(String []args) {
    int arr[][] ={
        {2,3,4,5,6},
        {5,8,6},
        {9,50,2}
    };
    int sum =0 ;
    for (int[] is : arr) {
        for (int element : is ) {
          sum+=element;  
        }  
    }
    System.out.println(sum);
    }
}