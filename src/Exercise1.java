import java.io.FileWriter;
import java.io.IOException;
public class Exercise1 {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("notes.txt"))
        {
            writer.write("Today is Sunday.\n");
            writer.write("I am at my boyfriend's house.\n");
            writer.write("He is sleeping.");

        } catch (IOException e) {
            System.out.println("You encountered: " + e.getMessage());
        }
    }
}
