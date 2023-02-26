
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int num = 0;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] arr = text.split(",");
            int age = Integer.valueOf(arr[1]);
            
            if(num < age){
                num = age;
                name = arr[0];
            }
            
        }
        System.out.print("Name of the oldest:"+name);

    }
}
