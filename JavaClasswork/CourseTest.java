
class Course {

    private String courseName;
    private int duration; 

    
    private final String trainingCenter = "CodeMentor Academy";

    
    private static int courseCount = 0;

    
    public Course() {
        this.courseName = "Default Course";
        this.duration = 4; 
        courseCount++;
    }

    
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
        courseCount++;
    }

   
    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public String getTrainingCenter() {
        return trainingCenter;
    }

    public static int getCourseCount() {
        return courseCount;
    }

    
    class CourseMaterial {
        public void showMaterialInfo() {
            System.out.println("Materials provided for this course.");
        }
    }
}

public class CourseTest {
    public static void main(String[] args) {
        
        Course course1 = new Course();

       
        Course course2 = new Course("Java Programming", 8);

       
        System.out.println("Course 1 Details:");
        System.out.println("Name: " + course1.getCourseName());
        System.out.println("Duration: " + course1.getDuration() + " weeks");
        System.out.println("Training Center: " + course1.getTrainingCenter());

        
        Course.CourseMaterial material1 = course1.new CourseMaterial();
        material1.showMaterialInfo();
        System.out.println();

      
        System.out.println("Course 2 Details:");
        System.out.println("Name: " + course2.getCourseName());
        System.out.println("Duration: " + course2.getDuration() + " weeks");
        System.out.println("Training Center: " + course2.getTrainingCenter());

        
        Course.CourseMaterial material2 = course2.new CourseMaterial();
        material2.showMaterialInfo();
        System.out.println();

        
        System.out.println("Total Courses Created: " + Course.getCourseCount());
    }
}
