
public class StudentTest {
    public static void main(String[] args) {
        
        Student student = new Student();

        student.setName("Rahul Sharma");
        student.setRollNo(101);
        student.setPercentage(87.5);

        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Percentage: " + student.getPercentage());
    }
}
