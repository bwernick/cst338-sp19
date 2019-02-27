import java.util.Scanner;

/**
 * Author: Bradley Wernick
 * Date: 2/11/2019
 * Purpose: Draw shapes with stars based on user input
 */
public class Draw {
    public static void main(String[] args){
        // initialize a scanner object
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        int size;

        while(loop){
            System.out.print("How many stars? (-1 to quit): ");
            //Use a scanner to read in values from the user
            String input = scan.nextLine();
            size = Integer.parseInt(input.trim());

            if(size == -1){
                loop = false;
            }else {
                Draw.square(size);
                System.out.println();
                Draw.triangle(size);
            }
        }
    }//end main

    static void square(int size){
        for(int i = 0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        return;
    }

    static void triangle(int size){
        for(int i = 1; i<=size; i++){
            printWhitespaces(size-i);   //white-space triangle
            //printWhitespaces(size-i+1);   //extra left side padding white-space triangle
            printStars(i);
            System.out.println("");
        }
        return;
    }

    private static void printWhitespaces(int size) {
        for(int i = 0; i < size; i++){
            System.out.print(" ");
        }
    }
    private static void printStars(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
    }
}
