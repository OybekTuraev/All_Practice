import java.io.File;
import java.util.Date;

public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("image/us.gif");
        System.out.println("Exist?: " + file.exists());
        System.out.println("File has " + file.length() + " bytes");
        System.out.println("Can it be read?: " + file.canRead());
        System.out.println("Can it be written?: " + file.canWrite());
        System.out.println("Directory?: " + file.isDirectory());
        System.out.println("File?: " + file.isFile());
        System.out.println("Absolute?: " + file.isAbsolute());
        System.out.println("Hidden?: " + file.isHidden());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Last modified on: " + new Date(file.lastModified()));
    }
}
