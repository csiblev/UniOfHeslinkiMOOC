
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num = 0;
        double sum = 0;
        
        while(true){
            System.out.println("Give a number: ");
            double temp = Integer.valueOf(scanner.nextLine());
            
            if(temp == 0){
                break;
            }
            num = num + (temp / temp);
            sum = sum + temp;
            //System.out.println(num);
        }
        System.out.println("Average of the numbers: "+ sum / num);
    }
}
