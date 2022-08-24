package comparator;

import java.util.*;

class Main {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Test", 25, 90000),
                new Employee("Zamir", 32, 120000),
                new Employee("Wasim", 20, 87000),
                new Employee("Ali", 45, 78000)
        );
        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Collections.sort(employees, Comparator.comparingInt(Employee::getAge));
        Collections.sort(employees, Comparator.comparing(Employee::getAge));
        System.out.println("Employees");
        System.out.println(employees);
        System.out.println("Employees sorted by name");
        Collections.sort(employees, new NameComparator());
        System.out.println(employees);
        System.out.println("Employees sorted by age");
        Collections.sort(employees, new Main().new AgeComparator());
        System.out.println(employees);
        Collections.sort(employees, (o1, o2) -> {
            if(o1.getSalary() > o2.getSalary()){
                return 1;
            }else if(o1.getSalary() < o2.getSalary()){
                return -1;
            }else {
                return 0;
            }
        });
        Collections.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
    }

     class AgeComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            if(o1.getAge() > o2.getAge()){
                return 1;
            }else if(o1.getAge() < o2.getAge()){
                return -1;
            }else {
                return 0;
            }
        }
    }
}
