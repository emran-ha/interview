package objclone;

class Person implements Cloneable {
    private String name;
    private int age;
    private Car car;
    Person(String name, int age, Car car){
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person pCopy = (Person) super.clone();
        pCopy.car = (Car) car.clone();
        return pCopy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

}
