import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Assignment {
    public static void main(String[] args) {
        String fileName = "assignment.txt";
        String content = "Java File Handling Practice";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

       
        try {
            String fileContent = Files.readString(new File(fileName).toPath());
            System.out.println(" Content read from file: " + fileContent);
        } catch (IOException e) {
            System.out.println(" Error reading file: " + e.getMessage());
            return;
        }

        
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println(" File deleted successfully.");
        } else {
            System.out.println(" Failed to delete the file.");
        }
    }
}
