
class Course {
    
    private String courseName;
    private int duration;  
    private int studentCount;

   
    private final String creatorName = "CodeMentor Academy";

   
    private static int totalStudents = 0;

    
    public Course(String courseName, int duration, int studentCount) {
        this.courseName = courseName;
        this.duration = duration;
        this.studentCount = studentCount;

        totalStudents += studentCount;
    }


    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

   
    static class Platform {
        public static void showPlatformMessage() {
            System.out.println("Courses are hosted on CodeMentor");
        }
    }
}


public class courseTest {
    public static void main(String[] args) {
        
        Course course1 = new Course("Java Programming", 8, 50);
        Course course2 = new Course("Web Development", 12, 70);

       
        System.out.println("Course 1 Details:");
        System.out.println("Name: " + course1.getCourseName());
        System.out.println("Duration: " + course1.getDuration() + " weeks");
        System.out.println("Students Enrolled: " + course1.getStudentCount());
        System.out.println("Creator: " + course1.getCreatorName());
        System.out.println();

        
        System.out.println("Course 2 Details:");
        System.out.println("Name: " + course2.getCourseName());
        System.out.println("Duration: " + course2.getDuration() + " weeks");
        System.out.println("Students Enrolled: " + course2.getStudentCount());
        System.out.println("Creator: " + course2.getCreatorName());
        System.out.println();

        
        System.out.println("Total Students Enrolled (All Courses): " + Course.getTotalStudents());
        System.out.println();

      
        Course.Platform.showPlatformMessage();
    }
}
