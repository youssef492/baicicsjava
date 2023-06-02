package array;
public class twoDarrayforloop {
    public static void main(String []args) {
        int arr4[][]={
            {1,22,50,60},  //first rows
            {1,2,3},
            {4}
              } ;
       
        for (int i = 0; i < arr4[0].length; i++) {
            System.out.print(arr4[0][i]+" ");
          }
          System.out.println();
          
          for (int j = 0; j < arr4[1].length; j++) {
           System.out.print(arr4[1][j]+" ");  
          }
         for (int rows = 0; rows < arr4.length; rows++) {
            for (int col = 0; col < arr4[rows].length ; col++) {  // لازم تحدد ال rows
                System.out.print(arr4[rows][col]+" ");
            }
            System.out.println();   
          }
          for (int[] r : arr4) {
            for (int c : r) {
                System.out.print(c+""); 
            }
            System.out.println();
          }   
    }
}
