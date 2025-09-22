
public class EmployeeTest {
    public static void main(String[] args) {
     
        Employee emp1 = new Employee();
        emp1.setName("Alice Johnson");
        emp1.setIdNumber(101);
        emp1.setDepartment("HR");
        emp1.setSalary(50000);

       
        Employee emp2 = new Employee();
        emp2.setName("Bob Smith");
        emp2.setIdNumber(102);
        emp2.setDepartment("IT");
        emp2.setSalary(65000);

        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("ID: " + emp1.getIdNumber());
        System.out.println("Department: " + emp1.getDepartment());
        System.out.println("Salary: " + emp1.getSalary());

        System.out.println();

        System.out.println("Employee 2 Details:");
        System.out.println("Name: " + emp2.getName());
        System.out.println("ID: " + emp2.getIdNumber());
        System.out.println("Department: " + emp2.getDepartment());
        System.out.println("Salary: " + emp2.getSalary());
    }
}


