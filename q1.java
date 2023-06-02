package quiz;
public class q1 {
    public static void main(String[]args) {
   int number1=2 , number2=4 , number3 ,i ,count =6 ;
     System.out.print(number1+" "+number2);
     for ( i = 2; i< count; ++i) {
     number3=number1+number2++;
     System.out.print(" "+number3);
     number1=number2;
     number2=number3;

     }


    }
}
