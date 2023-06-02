package quiz;
public class q3 {
    public static void main(String[] args) {
        int number = 587, r = 0;
        while (number != 0) {       
            int remander = number % 10;
            r = r * 10 + remander;
            number = number / 10;
        }
        System.out.println(r);
    }
}
