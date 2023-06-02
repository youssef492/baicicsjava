public class test {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{1,-2,1},{4,5,6}};
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[1].length; j++) {
            if(arr[i][j]==1){
                arr[i][j]=0;
            }
           } 
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][i]);
            }
        }
    }
}
