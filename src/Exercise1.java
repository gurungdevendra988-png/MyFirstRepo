import java.io.FileWriter;
import java.io.IOException;
public class Exercise1 {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("notes.txt"))
        {
            writer.write("Today is 27 september.\n");
            writer.write("And it is Sunday.");

        } catch (IOException e) {
            System.out.println("You encountered: " + e.getMessage());
        }
    }
}
