package array;
public class twoDarray {
    public static void main(String []args) {
      int [][]arr =new int [3][]; //[rows][columns] you must make rows
      arr[0] =new int[4] ;
      arr[1]=new int[4] ;
      arr[2]= new int[4];

      arr[0][0]=55;
      arr[0][1]=99;
      arr[0][2]=55;
      arr[0][3]=99;


      arr[1][0]=55;
      arr[1][1]=99; 
      arr[1][2]=55;
      arr[1][3]=99;


      arr[0][0]=55;
      arr[0][1]=99;
      arr[0][0]=55;
      arr[0][1]=99;
  /*------------------------------------------------ */
  int arr2[][]=new int[3][4]; //طريقه ثانيه
 /*------------------------------------------------ */
 int arr3[][]=new int[][]{
   {1,22,50,60},  //first rows
   {1,2,3},
   {4}
 };
 /*------------------------------------------------- */
     int arr4[][]={
   {1,22,50,60},  //first rows
   {1,2,3},
   {4}
     } ;
     /*  System.out.println(arr4.length);//عدد ال rwos
      System.out.println(arr4[0].length);// columns
      for (int i = 0; i < arr4[0].length; i++) {
        System.out.print(arr4[0][i]+" ");
      }
      System.out.println();*/
      
     /* for (int j = 0; j < arr4[1].length; j++) {
       System.out.print(arr4[1][j]+" ");  
      }*/
     /* for (int rows = 0; rows < arr4.length; rows++) {
        for (int col = 0; col < arr4[rows].length ; col++) {  // لازم تحدد ال rows
            System.out.print(arr4[rows][col]+" ");
        }
        System.out.println();   
      }*/
      for (int[] r : arr4) {
        for (int c : r) {
            System.out.print(c+""); 
        }
        System.out.println();
      }
 /*------------------------------------------------- */
      
    }
}
