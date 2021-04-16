import java.io.File;
import java.io.PrintWriter;

public class TestPrintWriterWithAutoClose {
    public static void main(String[] args) throws Exception {
        File file = new File("scores1.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        try (
                PrintWriter output = new PrintWriter(file); // declare and create resource
        ) {
            output.print("John T Smith ");
            output.println(90);
            output.print("Erick K Jones ");
            output.println(85);
        }
    }
}
