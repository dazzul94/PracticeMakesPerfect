package bitcamp.java100;
    public class Test12_9 {
        public static void main(String[] args) {
            char n1, n2, n3;
            n1 = '홍'; // 작은 따옴표는 해당 글자의 유니코드 값을 리턴한다.
            n2 = '길'; 
            n3 = '동';
            System.out.printf("%c %c %c\n", n1, n2, n3);
            n1 = 0xac00;
            n2 = 0xac10;
            n3 = 0xac20;
            System.out.printf("%c %c %c\n", n1, n2, n3);
            n1 = 0xbcf0;
            n2 = 0xbcf1;
            n3 = 0xbcf2;
            System.out.printf("%c %c %c\n", n1, n2, n3);
            n1 = 44032;
            n2 = 44035;
            n3 = 44038;
            System.out.printf("%c %c %c\n", n1, n2, n3);

            char x = '7';
            char y = '0';
            int z = x-y;
            System.out.println(z);
        }
    }