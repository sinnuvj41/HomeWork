public class Task {
    public static void main(String[] args) {
        
        int[] marks = {78, 82, 91, 65, 34};
        int total = 0;
        double average;
        boolean fail = false;

        
        for (int mark : marks) {
            if (mark < 35) {
                fail = true;
                break; 
            }
            total += mark;
        }

        if (fail) {
            System.out.println("Result: Fail");
        } else {
            
            average = total / (double) marks.length;

            
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);

            if (average >= 90) {
                System.out.println("Grade: A");
            } else if (average >= 75) {
                System.out.println("Grade: B");
            } else if (average >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        }
    }
}