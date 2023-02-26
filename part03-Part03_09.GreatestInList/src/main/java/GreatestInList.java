
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int greatest = list.get(0);
        System.out.println("");
        for(int i = 0; i < list.size();i++){
            if(greatest < list.get(i)){
                greatest = list.get(i);
            }
        }
        System.out.println("The greatest number: "+greatest );
        // implement finding the greatest number in the list here
    }
}
