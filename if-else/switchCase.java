import java.util.Scanner;

public class switchCase {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1 : System.out.println("Burger");
            break;
            case 2 : System.out.println("Milk Shake");
            break;
            case 3 : System.out.println("ButterScotch");
            break;
            case 4 : System.out.println("IceCream");
            break;
        }
       }
    
}
