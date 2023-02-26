
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int iteration = 0;
        int odd = 0;
        int even = 0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            if(num % 2 == 0){
                even++;
            }else{
                odd++;
            }
            sum += num;
            iteration += num / num ;            
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+iteration);
        System.out.println("Average: "+1.0 *sum / iteration);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
