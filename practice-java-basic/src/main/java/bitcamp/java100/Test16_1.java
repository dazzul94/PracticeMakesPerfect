package bitcamp.java100;

public class Test16_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 100;
        { 
            a =200;
            System.out.println(a);
            {
                int b = 100;
                System.out.println(b); 
                {
                    int c = 200;
                }
//                System.out.println(c);
            }
        }
    }

}
