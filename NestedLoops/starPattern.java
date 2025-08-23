import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much times print ");
        int num = sc.nextInt();
        for(int lines = 1; lines <= num ; lines++){
            for(int star = 1; star <= lines; star++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
