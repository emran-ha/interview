package inner_class;

class InnerClass {
    private String name;
    private MyInnerClass innerClass;
    InnerClass(){
        name = "Test";
        innerClass = new MyInnerClass();
    }
    public static void main(String[] args) {
        inner_class.InnerClass p = new inner_class.InnerClass();
        p.innerClass.innerMethod();

    }
    private class MyInnerClass {
        private int age;
        private String name;
        private void innerMethod(){
            age = 23;
            name = "faisal";
            System.out.println(name + " " + age);
            System.out.println(inner_class.InnerClass.this.name);
        }
    }
}
