import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Swapping : ");
        System.out.println("Value of a : ");
        int a = input.nextInt();
        System.out.println("Value b : ");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);


    }
    
}
