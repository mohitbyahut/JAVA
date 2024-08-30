import java.util.Scanner;

public class Outer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator: ");
        System.out.println(" Enter the First Number");
        int firstNumber = input.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber = input.nextInt();
        float sum = firstNumber + secondNumber;
        System.out.println("Add number : " + sum);
    }
    
}
