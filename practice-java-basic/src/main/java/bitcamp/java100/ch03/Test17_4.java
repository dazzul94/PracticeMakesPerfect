package bitcamp.java100.ch03;

public class Test17_4 {
    static void m1(int ... values) {
        System.out.printf("아규먼트 개수 : %d\n", values.length);
        for (int v : values) {
            System.out.println(v);
        }
    }
    static void m2(String name, int kor, int ... values) {
        System.out.println("m2 실행됌!");
    }
    static void sum(int ... values) {

        int sum = 0;
        for(int v : values) {
            sum += v;
        }

    }
    public static void main(String[] args) {
        m1(1, 2);
        m2("김다솔", 100, 80, 90, 100);
        sum(3, 4, 5, 6);
        


    }
}
