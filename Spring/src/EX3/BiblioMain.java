package EX3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BiblioMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./EX4Context.xml");
        Library lib1 = (Library) applicationContext.getBean("lib1");
        System.out.println(lib1);
    }
}