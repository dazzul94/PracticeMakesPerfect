package bitcamp.java100.ch03;

import java.util.ArrayList;

public class Test17_7 {
    static ArrayList m1() {
        ArrayList list = new ArrayList();
        list.add("고수지");
        list.add(20);
        list.add(false);
        list.add(4.12f);
        list.add('M');
        
        return list;
        
    }
    public static void main(String[] args) {
        for(Object v : m1()) {
            System.out.println(v);
        }
    }
}
