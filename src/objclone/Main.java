package objclone;

class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Ford", "G-Wagon");
        Person p = new Person("John", 27, car);
        System.out.println(p);

        Person p1 = (Person) p.clone();
        System.out.println(p1);

        p.getCar().setModel("Marathon");
        System.out.println(p);
        System.out.println(p1);
    }
}
