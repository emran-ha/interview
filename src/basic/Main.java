package basic;

 class Main {
    int x = 10;
    static  int y = 100;
    {
        x = y;
        y++;
        System.out.println(y + " Initialization block " + x);
    }
    static {
        System.out.println("Initialization static block " + y);
    }
    Main(int s){
        System.out.println("single parameter constructor : " + s);
    }
    Main(){
        this(45);
        System.out.println("default constructor : ");
    }

    public static void main(String[] args) {
        Main mm = new Main();
        Main m1 = new Main();
        Main m2 = new Main();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
