package intfs;

interface Test {
    int x = 100;
    default void display(){
        System.out.println("inside default interface method");
    }
    static void show(){
        System.out.println("inside static interface method");
    }

    void callme();

}
