
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] arr = text.split(" ");
            
            System.out.println(arr[0]);
        }

    }
}