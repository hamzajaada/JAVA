public class App {
    public static void main(String[] args) {
       classSingleton a= classSingleton.getInstance();
       classSingleton b= classSingleton.getInstance();
       classSingleton c= classSingleton.getInstance();
       System.out.println(a==b);
       System.out.println(a==c);
       System.out.println(b==c);
      
    }
}
