package bitcamp.java100.ch14.ex1;

public class Child extends Person {
    @Override
    void whoAmI() {
        System.out.println("I'm child");
    }
}
//매번 Child1, Child2 ... 만들 수는 없다
//일회용 클래스..=>익명클래스로 만든다