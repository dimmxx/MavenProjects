//package lesson22_16022019.man;
//
//public class ManClass extends Thread {
//
//    String name;
//
//    public ManClass(String name) {
//        this.name = name;
//        start();
//    }
//
//    @Override
//    public void run() {
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(name + ": ");
//
//        for (int i = 0; i < 20; i++) {
//            double step = Math.random()*4;
//            int stepI = (int)step;
//
//            for (int j = 0; j < stepI; j++){
//                sb.append("_ ");
//            }
//
//
//
//
//        }
//
//        System.out.println(sb);
//    }
//}