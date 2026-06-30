import java.util.*;
class EmployeeDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of the Employee :" );
        String empName = sc.nextLine();
        System.out.print("Employee ID :");
        int empId = sc.nextInt();
        System.out.print("Department :");
        String dept = sc.nextLine();
        System.out.print("Salary per month :");
        double sal = sc.nextDouble();
        System.out.println("Employee Details");
        System.out.println("Name of the Employee :" +empName);
        System.out.println("Employee ID :" +empId);
        System.out.println("Department :" +dept);
        System.out.println("Salary per month :" +sal);
    }
}