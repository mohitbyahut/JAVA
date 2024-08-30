import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perimeter of Rectangle: ");
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();


        double Rectangle = a + b + c + d;
        System.out.println("Rectangle value: " + Rectangle);
    }
    
}
