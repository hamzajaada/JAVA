import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Charger le contexte Spring à partir du fichier XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Récupérer les instances des beans définis dans le fichier XML
        Circle circle = (Circle) context.getBean("circle");
        Square square = (Square) context.getBean("square");

        // Utiliser les beans
        System.out.println("Circle - Radius: " + circle.getRadius());
        System.out.println("Square - Side: " + square.getSide());
    }
}
