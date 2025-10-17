/*
WAP to read a no and check if it is positive no or not.
If the given no is positive then check if it is two digit no or not
 */
import java.util.Scanner;
public class nested_2q {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the num");
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println("num is positive");
            if(num>9 && num<100)
            {
                System.out.println("number is two digit");
            }
            else
            {
                System.out.println("num is not two digit");
            }
        }
        else
        {
            System.out.println("num is not positive");
        }

    }
}
