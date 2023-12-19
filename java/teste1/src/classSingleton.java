public class classSingleton {
    private static classSingleton instance = new classSingleton();
    private classSingleton(){

    }
    public static classSingleton getInstance(){
        return instance;
    }
}
