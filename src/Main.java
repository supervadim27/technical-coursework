import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Курсовое задание");
        Employee employee1 = new Employee("Василий Петров", 1, 25000);
        Employee employee2 = new Employee("Светлана Соколова", 2, 23899);
        Employee employee3 = new Employee("Степан Разин", 3, 32987);
        Employee employee4 = new Employee("Антон Портнов", 4, 27500);
        Employee employee5 = new Employee("Никита Пихтов", 5, 47999);
        EmployeeBook employeeBook = new EmployeeBook(10);




        System.out.println(employee1.getId()+" "+employee1.getName()+" "+employee1.getSalary()+" "+employee1.getDepartment());
        System.out.println(employee2.getId()+" "+employee2.getName()+" "+employee2.getSalary()+" "+employee2.getDepartment());
        System.out.println(employee3.getId()+" "+employee3.getName()+" "+employee3.getSalary()+" "+employee3.getDepartment());
        System.out.println(employee4.getId()+" "+employee4.getName()+" "+employee4.getSalary()+" "+employee4.getDepartment());
        System.out.println(employee5.getId()+" "+employee5.getName()+" "+employee5.getSalary()+" "+employee5.getDepartment());


    }
}

