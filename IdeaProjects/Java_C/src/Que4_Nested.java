import java.util.Scanner;
public class Que4_Nested {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the Number : ");
        num=sc.nextInt();

        if(num==55)
        {
            System.out.println("You Win");
        }
        else
        {
            System.out.println("You Lose");
            if(num>55)
            {
                System.out.println("Number is Greater");
            }
            else
            {
                System.out.println("Number is Smaller");
            }
        }
    }
}
