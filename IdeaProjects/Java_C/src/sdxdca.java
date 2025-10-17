/*
●	Create a program that takes a character grade ('A', 'B', 'C', 'D', 'F')
and prints a message with the range of marks associated with that grade using a switch case.
 */
import java.util.Scanner;
public class sdxdca {
    static void main() {
        Scanner sc=new Scanner(System.in);
        char grade;
        System.out.println("enter");
        grade=sc.next().charAt(0);
        switch(grade)
        {
            case 'A':
                System.out.println("90-100");
                break;
            case'B':
                System.out.println("80-90");
                break;
            case'C':
                System.out.println("70-80");
                break;
            case'D':
                System.out.println("60-70");
                break;
            case'F':
                System.out.println("50-60");
                break;
            default:
                System.out.println("not valid");
        }



    }
}
