import java.util.Scanner;

public class EvenOdd {
    public static void main( String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to OddEven calc: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("is a Even num");
            
        }
        else{
            System.out.println("is Odd num");
        }
    }   
}
