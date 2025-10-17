/*
nested if else
if (condition)
{
    if (condition)
    {
        if (condition)
        {
            body
         }
         else
         {
            body if 3rd condition is false
         }
     }
     else
     {
        body if 2nd condition is false
     }
}
else
{
    body if 1st condition is false
}
Read a number from user then check that number is positive or negative. if it is positive then
check it is even or odd.
 */
import java.util.Scanner;
public class Nested_if_Else {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the Number : ");
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Number is Positive");
            if(num%2==0)
            {
                System.out.println("Number is Even");
            }
            else
            {
                System.out.println("Number is Odd");
            }
        }
        else
        {
            System.out.println("Number is Negative");
        }
    }
}
