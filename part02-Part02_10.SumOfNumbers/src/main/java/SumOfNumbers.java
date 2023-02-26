
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        
        while(true){
            System.out.println("Give a number:");
            int temp = Integer.valueOf(scanner.nextLine());
            
            if(temp == 0){
                break;
            }
            num = num + temp;
        }
        System.out.println("Sum of the numbers: "+num);
    }
}
