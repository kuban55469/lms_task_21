import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //getWriter();
        getRider();

    }

    public static void getRider(){
        try (FileReader fileReader = new FileReader("info.txt")){
            Scanner scanner = new Scanner(fileReader);
            int counter = 0;
            while (scanner.hasNextLine()){
                counter++;
                System.out.println(counter + ": " + scanner.nextLine());
            }
        }catch (IOException e){
            System.err.println("Error file");
        }
    }
    public static void getWriter(){
        try (FileWriter fileWriter = new FileWriter("info.txt")){
            for(char c = 'A',  d = 'a'; c <= 'Z'; c++, d ++) {
                fileWriter.write(c + " " + d + "\n");
            }
            for (int i = 0; i < 10; i++){
                fileWriter.write(i + "\n");
            }
        }catch (IOException e ){
            System.err.println("Error file.");
        }
    }
}