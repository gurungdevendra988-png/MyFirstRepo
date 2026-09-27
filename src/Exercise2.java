import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;
public class Exercise2 {
    public static void main(String[] args)
    {
        try {
            List<String> lines = Files.readAllLines(Path.of("notes.txt"));
//            lines.forEach(System.out::println); //method reference
            for (String line: lines)
            {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("You encountered: " + e.getMessage());
        }

    }
}
