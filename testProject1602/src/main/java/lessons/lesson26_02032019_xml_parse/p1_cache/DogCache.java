package lessons.lesson26_02032019_xml_parse.p1_cache;

import java.lang.ref.WeakReference;

public class DogCache {

    WeakReference<Dog> wr = new WeakReference<Dog>(null);

    Dog getDog(){
        Dog dog = null;
        String message = "Cached dog";
        if(wr.get() == null){
            dog = new Dog();
            wr = new WeakReference<Dog>(dog);
            dog = null;
            message = "Created dog";

        }
        System.out.println(message);
        return wr.get();
    }








//    public WeakReference<Dog> getDog(){
//
//        if(wr.get() != null){
//            System.out.println("Giving a new Dog");
//
//            return new wr(new Dog());
//        }else{
//
//        }





    }





