import java.util.Scanner;

public class marksSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
    // Ternary Operator
    String type = ( marks >= 33 ) ? "Pass" : "Fail";
    System.out.println(type);

    }
    
}
