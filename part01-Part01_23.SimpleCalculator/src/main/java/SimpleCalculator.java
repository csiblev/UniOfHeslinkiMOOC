
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int integer1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int integer2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println(integer1 + " + " + integer2 +" = " + (integer1 + integer2));
        System.out.println(integer1 + " - " + integer2 +" = " + (integer1 - integer2));
        System.out.println(integer1 + " * " + integer2 +" = " + (integer1 * integer2));
        System.out.println(integer1 + " / " + integer2 +" = " + (1.0 * integer1 / integer2));
        
        
        
        
    }
}
