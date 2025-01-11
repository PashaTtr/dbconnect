public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();


        employeeDAO.addEmployee("Dina", 30, "dev", 54000.0f);
        employeeDAO.addEmployee("Milan", 25, "president", 30600.0f);


        System.out.println("All Employees:");
        for (String employee : employeeDAO.getAllEmployees()) {
            System.out.println(employee);
        }


        employeeDAO.updateEmployee(1, "Deny", 31, "security", 65000.0f);


        employeeDAO.deleteEmployee(2);


        System.out.println("\nUpdated Employees:");
        for (String employee : employeeDAO.getAllEmployees()) {
            System.out.println(employee);
        }
    }
}
