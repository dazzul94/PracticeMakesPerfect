package ch03;

import java.util.ArrayList;

public class Test17_8 {
    private static class Member {
        String name;
        int age;
        boolean working;
        float score;
        char level;
    }
    static Member m1() {
        Member ref = new Member();
        ref.name = "고수지";
        ref.age = 24;
        ref.working = false;
        ref.score = 3.0f;
        ref.level = 'M';
        return ref;
    }
    public static void main(String[] args) {
        System.out.println(m1().name);
        System.out.println(m1().age);
        System.out.println(m1().working);
        System.out.println(m1().score);
        System.out.println(m1().level);

    }
}
