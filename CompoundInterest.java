
import java.util.Scanner;
public class CompoundInterest {


  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value of Principle: ");
        int P = input.nextInt();
        System.out.print("Enter the Value of year: ");
        float T = input.nextFloat();
        System.out.print("Enter the Iterest rate: ");
        float R = input.nextFloat();

        double CompoundInterest = P * Math.pow (( 1 + R / 100 ),T);
        System.out.println("total interest Rate is " + CompoundInterest);
    }
}

    

