
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double num = 0;
        double average = 0;
        while(true){
        	
            double temp = Double.valueOf(scanner.nextLine());
            
            if(temp == 0){
                break;
            }
            if(temp < 0) {
            	continue;
            }
            num = num + temp / temp;
            sum = sum + temp;
            average = sum / num;
    
        }
        if(average == 0){
            System.out.println("Cannot calculate the average");
            
        }else{
            System.out.println(average);
        }
    }
}
