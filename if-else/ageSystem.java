import java.util.*;

public class ageSystem {
    public static void main(String[] args) {
        int age = 61;
        if (age >= 18) {
            System.out.println("you are adult");
        }else if (age > 13 && age < 18) {
            System.out.println("Teenager");
        }else{
            System.out.println("You are not voting");
        }
    }
}
