package SpringMaven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {


ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"context.xml"});

        Owner owner = (Owner) context.getBean("owner");
        System.out.println(owner);
    }
}
