/*
●	Write a program that takes two numbers and an operator (+, -, *, /)
 as input and performs the corresponding arithmetic operation using a switch case.
 */
import java.util.Scanner;
public class qution5 {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        int num1;
        System.out.println("enter the number");
        num1=sc.nextInt();
        int num2;
        System.out.println("enter the number");
        num2=sc.nextInt();
        char operator;
        System.out.println("enter the operator");
        operator=sc.next().charAt(0);
        switch (operator)
        {
            case'+':
                int add=num1+num2;
                System.out.println(add);
                break;
            case'-':
                int sub=num1-num2;
                System.out.println(sub);
                break;
            case'*':
                int mul=num1*num2;
                System.out.println(mul);
                break;
            case'/':
                int div=num1/num2;
                System.out.println(div);
                break;
            default:
                System.out.println("not valid");
        }



    }
}
