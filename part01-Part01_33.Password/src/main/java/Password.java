
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String pass = "Caput Draconis";
        System.out.println("Password?");
        String input = scan.nextLine();
        if(input.equals(pass)){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
