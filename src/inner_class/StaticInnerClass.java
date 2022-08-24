package inner_class;

class StaticInnerClass {
    private String name;
    StaticInnerClass(){
        this.name = "TestParameter";
    }
    static class InnerStaticClass{
        private int age = 10;
        static String details = "Age is a number";
        static void display(){
            System.out.println("Details is " + details);
        }
        void show(){
            System.out.println("Age is " + age);
        }

    }

    public static void main(String[] args) {
        InnerStaticClass.display();
        InnerStaticClass innerClass =  new InnerStaticClass();
        innerClass.show();
    }
}
