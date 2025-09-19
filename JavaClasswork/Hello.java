import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hello {


    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public static void main(String[] args) {

        
        String[] names = {"Rahul", "Sneha", "Arjun", "Meena", "Vikram"};
        int[] marks = {80, 92, 28, 67, 49};

        
        System.out.println("Student Marks Report:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + marks[i]);

            
            if (marks[i] < 35) {
                System.out.println(" -> Needs Improvement");
            }
        }

        
        double average = calculateAverage(marks);
        System.out.println("\nAverage Marks: " + average);

        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Program Ended On: " + now.format(format));
    }
}