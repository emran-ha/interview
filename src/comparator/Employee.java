package comparator;

class Employee implements Comparable<Employee>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary='" + salary + '\'' +
                '}';
    }

    private double salary;

    @Override
    public int compareTo(Employee o) {
        if(age > o.getAge()){
            return 1;
        }else if(age < o.getAge()){
            return -1;
        } else {
            return 0;
        }

    }
}
