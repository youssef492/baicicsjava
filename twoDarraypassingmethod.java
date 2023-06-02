package array;
public class twoDarraypassingmethod {
    
     static void print(int a[][]){
            for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a[i].length; j++) {
           System.out.print(a[i][j]+" "); 
           }
           System.out.println();     
            }
        }
    public static void main(String []args ) {   
        int [][]arr ={  // matrix
       {1,3,5},
       {2,4,6},};
       print(arr);
}
}