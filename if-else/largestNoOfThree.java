import java.util.Scanner;

public class largestNoOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 9;
        int B = 3;
        int C = 6;

        if ((A >= B) && (A >= C)) {
            System.out.println(" Print A");
        }else if (B >= C ) {
            System.out.println("print B");
        }else{
            System.out.println("Print C");
        }
    }
}
