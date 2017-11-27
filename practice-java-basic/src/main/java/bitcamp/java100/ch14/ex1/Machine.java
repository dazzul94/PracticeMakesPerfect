package bitcamp.java100.ch14.ex1;

public class Machine {
    Remocon remocon = new Remocon() {

        @Override
        public void on() {
            System.out.println("TV을 켭니다");

        }

        @Override
        public void off() {
            System.out.println("TV을 끕니다");

        }

    };
    public static void main(String[] args) {
        Machine m = new Machine();
        m.remocon.off();
        m.remocon.on();
    }
}
