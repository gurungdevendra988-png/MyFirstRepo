import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileRead {
    public static void main(String[] args)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("You encountered: " +e.getMessage());
        }
    }
}


