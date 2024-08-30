import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grastest num calc: ");
        System.out.println("Enter first number: ");
        int first = input.nextInt();
        System.out.println("Enter second num: ");
        int second = input.nextInt();
        System.out.println("Enter third num: ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first + "is a greatest num ");
            
        }
        else if (second >= third) {
            System.out.println(second + "is a greatest num ");
            
        }
        else {
            System.out.println(third + "is a greatest num ");
        }
    }
    
}
