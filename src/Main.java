import java.util.Arrays;

public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Василий Петров", 1, 25000);
        employees[1] = new Employee("Светлана Соколова", 2, 23899);
        employees[2] = new Employee("Степан Разин", 3, 32987);
        employees[3] = new Employee("Антон Портнов", 4, 27500);
        employees[4] = new Employee("Семен Кубов", 5, 33500);
        employees[5] = new Employee("Мария Плеханова", 4, 55000);
        employees[6] = new Employee("Евгений Синев", 2, 15000);
        employees[7] = new Employee("Андрей Васильев", 1, 88500);
        employees[8] = new Employee("Салават Юлаев", 3, 45000);
        employees[9] = new Employee("Нельсон Мандела", 1, 60000);
        printAllFields();
        getAllSalary();
        findEmployeeMinSalary();
        findEmployeeMaxSalary();
        getMiddleSalary();
        getAllNames();
    }
    public static void printAllFields() {
        System.out.println();
        System.out.println("Курсовое задание");
        System.out.println();
        System.out.println("Все данные по сотрудникам:");
        for (int i = 0; i < employees.length ; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();
    }
    public static void getAllSalary() {
        System.out.println("Сумма затрат на ФОТ (фонд оплаты труда):");
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].salary;
        }
        System.out.println(sum + " руб");
        System.out.println();
    }
    public static void findEmployeeMinSalary() {
        System.out.println("Неудачник с минимальной зарплатой:");
        double min = employees[0].salary;
        String name = employees[0].name;
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].salary < min) {
                min = employees[i].salary;
                name = employees[i].name;
            }
        }
        System.out.println(min + " руб, зовут " + name);
        System.out.println();
    }
    public static void findEmployeeMaxSalary() {
        System.out.println("Самый ценный сотрудник с самой большой зарплатой:");
        double max = employees[0].salary;
        String name = employees[0].name;
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].salary > max) {
                max = employees[i].salary;
                name = employees[i].name;
            }
        }
        System.out.println(max + " руб, зовут " + name);
        System.out.println();
    }
    public static void getMiddleSalary() {
        System.out.println("Средняя зарплата:");
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].salary;
        }
        double midSum = sum / employees.length;
        System.out.println(midSum + " руб");
        System.out.println();
    }

    public static void getAllNames() {
        System.out.println("Список сотрудников (ФИО):");
        String name;
        for (int i = 0; i < employees.length; i++) {
            name = employees[i].name;
            System.out.println(name);
        }
    }
}

