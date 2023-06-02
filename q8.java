package quiz;
public class q8 {
    public static void main(String[]args) {
        for (int i = 1; i <=3; i++) {
          for (int j = 1; j <=2; j++) {
            for (int k = 1; k <=2; k++) {
              if((k==j) | (k++==i))
              System.out.print(j==i?k++:i++);  
            }
          }  
        }
    }
}
