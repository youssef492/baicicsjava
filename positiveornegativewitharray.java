package array;
public class positiveornegativewitharray {
    public static void main(String[] args) {
        int num[]={10,0,-10};
        for (int i = 0; i <num.length; i++) {
         if(num[i]>0){
            System.out.println(num[i]+" is positive");
         }else if(num[i]<0){
            System.out.println(num[i]+" is negative");
         }
          
           else{System.out.println(num[i]+" is zero");} 
        }
    }
}
