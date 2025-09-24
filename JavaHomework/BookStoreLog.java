import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class BookStoreLog {
    public static void main(String[] args) {
        String fileName = "log.txt";
        String message = "Book order placed at 10:30 AM";  
        
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(message);
            System.out.println(" Message written to " + fileName);
        } catch (IOException e) {
            System.out.println(" Failed to write message: " + e.getMessage());
            return;
        }

        
        try {
            String content = Files.readString(new File(fileName).toPath());
            System.out.println(" Message read from file: " + content);
        } catch (IOException e) {
            System.out.println(" Failed to read message: " + e.getMessage());
            return;
        }

       
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println(" File " + fileName + " deleted successfully.");
        } else {
            System.out.println(" Failed to delete file " + fileName);
        }
    }
}
