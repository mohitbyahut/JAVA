import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter to temperature converter: ");
        System.out.print("Enter the Temp in F: ");
        float fah = input.nextFloat();
        float cel = (fah - 32) * 5 / 9;
        System.out.println("Celsius temp: " + cel + "C");
    }
    
}
