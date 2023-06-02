package array;
public class sum1_2D {
    public static void main(String[]args) {
     int[][] arr ={{1,2,3,4,5},{6,9,8,7,6},{55,3,5,78,8}};
     int sum =0;
     for (int[] rwos : arr) {
        for (int is : rwos) {
            sum+=is;
        }
     }
     System.out.println(sum);
     }
    }

