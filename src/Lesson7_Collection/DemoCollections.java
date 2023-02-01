package Lesson7_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoCollections {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        
        System.out.println("---List---");
        System.out.println(l);
        System.out.println("---Set---");
        System.out.println(s);
        
        l.addAll(s);
        s.addAll(l);
        System.out.println("---l.addAll()---");
        System.out.println(l);
        System.out.println("---s.addAll()---");
        System.out.println(s);
        
        Collections.shuffle(l);
        System.out.println("---l.shuffle()---");
        System.out.println(l);
        
        Collections.sort(l);
        System.out.println("---l.sort()---");
        System.out.println(l);
        
        Collections.reverse(l);
        System.out.println("---l.reverse()---");
        System.out.println(l);
        
        
    }
}
