/*
WAP to check whether you are eligible for work or not.
If age is between 18 to 60 then you are eligible but greater than 60 then
too old to work. If you are not eligible then display minor
 */
import java.util.Scanner;
public class nested_3q {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the num");
        num=sc.nextInt();
        if(num>=18 && num<=60)
        {
            System.out.println("eligible for work ");
        }
        else
        {
            System.out.println("not eligibel of work");
        }



    }
}
