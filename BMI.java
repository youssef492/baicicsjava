package excercises;
import java.util.Scanner;
public class BMI {
    public static void main(String[]args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the weight in Kg : ");
        double weight=in.nextDouble();
        System.out.println("enter height in meters : ");
        double height=in.nextDouble();
        double BMI= (weight/(height*height));
        if(BMI<18.5){
            System.out.println("the category from BMI is underweight");
        }else if( BMI<25){
            System.out.println("the category from BMI is normal");
        }else if( BMI<30){
            System.out.println("the category from BMI is overweight");
        }else{
            System.out.println("the category from BMI is obese");
        }
    }
}
