import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *author: Bradley Wernick
 *date: 2/6/2019
 *Description: File Reader, creates a file if one doesn't exist.
 * Reads the contents of the files.
 * Takes the comma separated line and turns it into individual line outputs;
 * Also cleans off whitespace from the input line
 */

public class FileReader {
  public static void main(String args[]){
      FileReader freader = new FileReader();
      String filename = "myFile.txt";
      File f = new File(filename);
      Scanner scan = null;

      try {
          if (f.createNewFile()) {
              System.out.println(filename + " created successfully");
          } else {
              System.out.println(filename + " already exists");
          }

          scan = new Scanner(f);
      }catch(FileNotFoundException e){
          System.out.println("Could not find the file..."
                  + "even though we are making it + e");
          e.printStackTrace();
      }catch(IOException e){
        System.out.println("Error occurred when creating file");
        e.printStackTrace();
      }

      while(scan!=null && scan.hasNext()){
          String input = scan.nextLine();
          System.out.println(input + ":");
          freader.listing(input.split(","));
      }

      /**boolean loop = true;
      while(loop){
          System.out.print("Enter something (zz to exit): ");
          String input = scan.nextLine();

          if(input.trim().toLowerCase().equals("zz")){
              loop = false;
              break;
          }

          System.out.println("You entered: " + input);
      }*/
  }

  private void listing(String[] input){
    for(int i = 0; i < input.length; i++){
        System.out.println(input[i].trim());
    }
    return;
  }

}
