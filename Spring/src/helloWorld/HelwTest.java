package helloWorld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelwTest {
   public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helwContext.xml");
        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloWorld");
        helloWorld.execute();
    }
}  

