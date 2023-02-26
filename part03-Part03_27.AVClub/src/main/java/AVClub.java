
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int c = 0;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] arr = text.split(" ");
            for(String i : arr){
                if(i.contains("av")){
                System.out.println(i);
                }
            }
        }
    }
}
