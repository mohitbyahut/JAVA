import java.util.Scanner;

public class invertedStarPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much times print: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int star = num; star >= i; star--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}