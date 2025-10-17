/*
AP to read a no and check if it is positive no or not. If the given no is
positive then check it is even no or odd no
 */
import java.util.Scanner;
public class nested__1qq {
    public static void main(){
     Scanner sc= new Scanner(System.in);
     int num;
     System.out.println("enter the number");
     num=sc.nextInt();
     if(num>0)
     {
         System.out.println("num is positive");
         if(num%2==0)
         {
             System.out.println("num id even");
         }
         else {
             System.out.println("num is odd");
         }

     }else{
         System.out.println("num is negetive");

     }




    }
}
