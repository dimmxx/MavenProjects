package lessons.lesson22_16022019_thread.man.man1;

public class MainMan {


    public static void main(String[] args) {

        ManClass man1 = new ManClass("John");


        ManClass man2 = new ManClass("Mary");


        while (!man1.win && !man2.win){

        }


//        while(!lessons.lesson22_16022019_thread.man.man1.isAlive() && !man2.isAlive()){
//
//        }

        System.out.println((man1.win ? man1.name : man2.name) + "WIN");




    }



}
