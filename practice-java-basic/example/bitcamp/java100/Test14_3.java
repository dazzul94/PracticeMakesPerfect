package bitcamp.java100;
    public class Test14_3{
        public static void main(String[] args) {
            class Student {
                String name;
                String address;
                int age;
                boolean love;
            }
            Student s1;
            s1 = new Student();
            s1.name ="고수지";
            s1.address = "봉화산역 드아뜨 359호";
            s1.age = 24;
            s1.love = true;

            System.out.printf("%s %s %d %b", s1.name, s1.address, s1.age, s1.love);
        }
    }