package basic;

 class Singleton {
    private static Singleton obj = null;
    static Singleton getInstance(){
        if(obj == null){
            obj = new Singleton();
        }
        return obj;
    }
    private Singleton(){}
}
