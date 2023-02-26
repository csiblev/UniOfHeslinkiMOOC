
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ave = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            list.add(input);
        }
        for(int i : list){
            ave += i;
        }
        System.out.println("Average: "+(1.0* ave/list.size()));
    }
}
