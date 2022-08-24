package intfs;

class TestImplementation extends Test1 implements Test,Test2{
    public static void main(String[] args) {
        TestImplementation implementation = new TestImplementation();
        implementation.display();
        Test.show();
        implementation.callme();

    }

    @Override
    public void callme() {
        super.callme();
        System.out.println(super.x+" call me method "+ Test.x + " other " + Test2.x);
    }
}
