package array;
public class twoDarraymatrix {
    public static void main(String []args ) {
       int [][]arr ={  // matrix
      {1,3,5},
      {2,4,6},};
      /*
      1 2
      3 4
      5 6
       */
   //matrix اذا طلب المعكوس بتاع ال 
      for (int i = 0; i < 3; i++) {  //rows
        for (int j = 0; j < 2; j++) {  //col
            System.out.print(arr[j][i]+" ");// [j][i]
        }
        System.out.println();
      }
       
    }
}
