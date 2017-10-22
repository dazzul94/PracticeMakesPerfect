package ch03;

public class Test17_4 {
    static void m1(int ... value) {
        System.out.printf("아규먼트 개수 : %d\n", value.length);
        for (int v : value) {
            System.out.println(v);
        }
    }
    static void m2(String name, int kor, int ... value) {
        System.out.println("m2 실행됌!");
    }
    static int sum(int ... value) {
        for() {
            sum +=value;
        }
            
    }
    public static void main(String[] args) {
        m1(1, 2);
        m2("김다솔", 100, 80, 90, 100);
    }
}
