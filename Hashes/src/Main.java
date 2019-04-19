import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

//        Object object = new Object();
//        int hCode;
//        hCode = object.hashCode();
//        System.out.println(hCode);
//
        User user1 = new User("Jack", 20);

        User user2 = new User("Jack", 20);
//
//        System.out.println(user1.equals(user2));

        Map<User, Integer> map = new HashMap<>();

        map.put(user1, 10);

        System.out.println(map.containsKey(user2));

        map.computeIfPresent(user2, (k, v) -> v + 1);




        System.out.println(map);









    }
}
