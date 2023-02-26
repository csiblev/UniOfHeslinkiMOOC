
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        int sum = 0;
        
        while(true){
            
            System.out.println("Give a number: ");
            int temp = Integer.valueOf(scanner.nextLine());
            if(temp == 0){
                break;
            }
            number = number + (temp / temp);
            
            sum = sum + temp;
        }
        System.out.println("Number of numbers: "+number);
        System.out.println("Sum of the numbers: "+sum);
    }
}
