package EX2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/Ex3Context.xml");
        Shape circle = (Shape)context.getBean("circle");
        System.out.println("Circle: " + circle.calculateArea());
        Shape square = (Shape)context.getBean("square");
        System.out.println("Square: " + square.calculateArea());
    } 
}
