import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial program: ");
        System.out.println("Enter a number to calculate factorial: ");
        int number = input.nextInt();
        Fact(number);

    }

    public static void Fact(int number) {
        int i = 1;
        int factorial = 1;
        while (i <= number) {

            factorial = factorial * i;
            i++;

        }
        System.out.println(factorial);
    }

}
