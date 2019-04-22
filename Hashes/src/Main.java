import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Object object = new Object();
//        int hCode;
//        hCode = object.hashCode();
//        System.out.println(hCode);
//
//        User user1 = new User("Jack", 20);
//
//        User user2 = new User("Jack", 21);
//
//        User user3 = new User("Mary", 23);
//
//        System.out.println(user1.equals(user2));
//
//        Map<User, Integer> map = new HashMap<>();
//
//        map.put(user1, 10);
//        map.put(user2, 100);
//        map.put(user3, 1000);
//
//        //System.out.println(map.containsKey(user2));
//
//        //map.computeIfPresent(user2, (k, v) -> v + 1);
//
//        for (user:map, user1)
//              {
//
//        }
//
//
//        System.out.println(map);


//        int[] array = new int[5];
//        for (int i = 0; i < 5; i++){
//            array[i] = i;
//        }
//        System.out.println(Arrays.toString(array));
//
//        for(int item:array){
//            System.out.print(item + 1);
//        }


        User user1 = new User("Jack", 20);

        User user2 = new User("Jack", 21);

        User user3 = new User("Mary", 23);

        Map<User, Integer> map = new HashMap<>();

        map.put(user1, 10);
        map.put(user2, 100);
        map.put(user3, 1000);

//        Iterator it = map.values().iterator();
//
//        while (it.hasNext()) {
//    System.out.println(it.next());


        for(User item : map.keySet()){
            System.out.println(item);
        }

        for (int value : map.values()) {
            System.out.println(value);
        }

        for (Map.Entry<User, Integer> entry : map.entrySet()) {
            System.out.println(entry);

        }
    }
}
