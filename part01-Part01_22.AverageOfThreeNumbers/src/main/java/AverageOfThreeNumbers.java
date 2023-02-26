
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int integer2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int integer3 = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is "+ ((1.0 * integer + integer2+integer3)/3));
        
    }
}
