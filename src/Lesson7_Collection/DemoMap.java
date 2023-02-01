package Lesson7_Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("nokia", 3000);
        m.put("oppo", 5000);
        m.put("ip", 15000);
        m.put("samsung", 10000);
        System.out.println(m);
    }
}
