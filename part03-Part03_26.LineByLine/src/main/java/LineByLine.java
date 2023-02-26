
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String sen = scanner.nextLine();
            if(sen.equals("")){
                break;
            }
            String[] word = sen.split(" ");
            for(String i: word){
                System.out.println(i);
            }
        }

    }
}
