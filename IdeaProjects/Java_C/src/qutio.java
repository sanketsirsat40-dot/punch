/*
Write a program that takes an integer input (1-12) and prints
the number of days in the corresponding month. Consider leap years for February.
 */
import java.util.Scanner;
public class qutio {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("enter the month");
        month=sc.nextInt();
        switch (month)
        {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            default:
                System.out.println("not valid");

        }


    }
}
