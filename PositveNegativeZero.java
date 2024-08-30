import java.util.Scanner;

public class PositveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to program og Positive negative zero: ");
        System.out.print("Enter the Number");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Your number is positive ");
            
        }
        else if (num == 0) {
            System.out.println(" your number is zero");
            
        }
        else{
            System.out.println("Your number is Negative");
        }
    }


}
