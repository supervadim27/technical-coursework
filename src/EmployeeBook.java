public class EmployeeBook {
    private Employee[] employees;


    public EmployeeBook(int size) {
        employees = new Employee[size];
        int count = 0;
        double sum = 0;

        for (Employee employee:employees) {
            count++;
            sum = employee.getSalary();
            
        }


        
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
