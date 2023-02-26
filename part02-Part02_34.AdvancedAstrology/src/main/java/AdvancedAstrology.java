
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int i = 1; i <= size;i++){
            printSpaces(size - i);
            printStars(i);
            //System.out.println("");
        }
        
        
    }

    public static void christmasTree(int height) {
        int o = 1;
        for(int i = 1; i <= height; i++){
            printSpaces(height-i);
            printStars(2 * i - 1);
            //System.out.println("");
            if(i==height){
                printSpaces(i-2);
                printStars(3);
                printSpaces(i-2);
                printStars(3);
            }
        }
    /*    int i = 1;
        int j = height - 1;
        while (i <= height) {
            printSpaces(j);
            printStars(i);
            printStars(i - 1);
            System.out.println();
            j--;
            i++;
        }
        printSpaces(height - 2);
        printStars(3);
        System.out.println();
        printSpaces(height - 2);
        printStars(3);
*/
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(4);
        System.out.println("");
        christmasTree(3);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");

        System.out.println("---");
        christmasTree(10);

    }
}
