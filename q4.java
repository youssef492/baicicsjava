package quiz;
public class q4 {
    public static void main(String[]args) {
        int number =742 ;
        int sumdigits =0 ;
        if(number>=100 && number<1000){
            sumdigits=number%10 + (number/10)%10 + (number/100);
        }
        System.out.println(sumdigits);
    }
}
