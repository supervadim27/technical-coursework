public class Employee {
    String name;
    int department;
    double salary;
    private static int count = 1;
    private int id;
    public Employee (String name, int department, float salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = count;
        count++;
    }
    public String toString() {
        return "Имя " + name + ", департамент №" + department + ", зарплата " + salary + " руб";
    }
    public String getName() {
        return name;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}

