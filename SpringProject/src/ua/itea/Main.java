package ua.itea;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {

//        Item item = new Item();
//        item.setName("Aghaim");
//
//        Pudge pudge = new Pudge();
//        pudge.setItem(item);
//        pudge.setLevel(11);
//        pudge.setName("Pudge");
//
//        System.out.println(pudge);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"context.xml"});
       // Item item = (Item) context.getBean("item");

        Pudge pudge = (Pudge) context.getBean("pudge");
        System.out.println(pudge);



    }


}
