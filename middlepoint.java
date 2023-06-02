package excercises;
import java.util.Scanner;

public class middlepoint {
  public static boolean middlepoint(int n1 , int n2 ,int n3){
  if((n1+n2)/2==n3 || (n1+n3)/2==n2 || (n2+n3)/2==n1){
    return true ;

  }
  return false ;

  }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter three numbers : ");
        int a = in.nextInt(); int b = in.nextInt(); int c = in.nextInt();
        System.out.println(middlepoint(a, b, c));
    }
}
