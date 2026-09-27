//Checked exceptions are ones the compiler forces you to acknowledge and handle before
// your code will even compile — because they represent predictable external failures
// (file I/O, network issues) that a well-written program should always be prepared for.
// Unchecked exceptions aren't enforced by the compiler at all — because they generally
// represent actual programming errors, and Java trusts the developer to write correct logic
// rather than forcing explicit handling for every conceivable mistake. Both types of exceptions,
// if triggered, actually occur while the program is running — the real difference is entirely about
// compiler enforcement, not about timing.

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter("output.txt");
//            writer.write("Hello. My name is Devendra Gurung.\n");
//            writer.write("My boyfriend name is Ripunjay Singh.");
//        }
//        catch (IOException e)
//        {
//            System.out.println("You encountered: " + e.getMessage());
//        }
//        finally
//        {
//            if (writer != null)
//            {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    System.out.println("You encountered: " + e.getMessage());
//                }
//            }
//        }

        try (FileWriter writer = new FileWriter("output.txt"))
        {
            writer.write("Hello!\n");
            writer.write("My name is Devendra.");
        }
        catch (IOException e)
        {
            System.out.println("You encountered: " + e.getMessage());
        }
    }
}
