package excercises;
import java.util.*;
 class ex {
    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
     System.out.println("enter frist sides from triangle : ");
     int x =in.nextInt();
     System.out.println("enter second sides from triangle : ");
     int y =in.nextInt();
     System.out.println("enter third sides from triangle : ");
     int z =in.nextInt();
     if((x+y)==z){
      System.out.println("this triangle is valid");
     }
     else if((x+z)==y)
     { System.out.println("this triangle is  valid");
   }else if((y+z)==x){
      System.out.println("this triangle is valid");
   }else{
      System.out.println("this triangle is not valid");
   }
   }
        }
      

