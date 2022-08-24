package inheritance;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("ty898", "Ahmad", 167000, 1200);
        Employee[] employees = new Employee[3];
        employees[0] = manager;
        employees[1] = new Employee("sy487", "John", 120000);
        employees[2] = new Employee("sy983", "Tom", 150000);
        Arrays.stream(employees).forEach(System.out::println);
        System.out.println(employees[0].getSalary());
        Employee emp1 = new Employee("490", "Emo", 120000);
        Employee emp2 = new Employee("490", "Emo", 120000);
        System.out.println(emp1.equals(emp1));

    }
}
