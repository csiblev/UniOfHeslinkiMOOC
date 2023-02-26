
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0, l = 0, counter = 0, temp = 0;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] arr = text.split(",");
            
            age = age + Integer.valueOf(arr[1]);
            counter++;
            l = arr[0].length();
            if(temp < l){
                temp = l;
                name = arr[0];
            }
            
        }
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+1.0* age / counter);

    }
}
