import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Multiplication calc: ");
        System.out.println("Enter the first number: ");
       String num = input.next();
        multiply(num);

    }

    public static void multiply(int num) {

        String i = 1;

        while (i <= num) {
            System.out.println(num + "X" + i + "=" + (num * i));

            i++;
        }

    }

}
