package bitcamp.java100.ch14.ex1;

public class Anonimous {
    
    public static void walk2(Person p) {
        p.whoAmI();
    }
    
    public static void main(String[] args) {
        Person p = new Person() {
            String name = "김다솔";
            void callMe() {
                System.out.println("call me call me");
            } //못쓴다
            @Override
            void whoAmI() {
                System.out.printf("내 이름은 %s 이다", name);
            }
        };
        
    p.whoAmI();
    walk2(p);
    
    }

}
