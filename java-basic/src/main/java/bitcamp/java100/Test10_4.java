package bitcamp.java100;
    public class Test10_4 {
        public static void main (String[] args) {
            System.out.printf("%s %c %d %o %x %f %b %tY\n ", "고수지", '고', 100, 100, 100, 3.14, true, new java.util.Date());

            System.out.printf("%1$-10.1f %2$4.2f %1$.3f %1$.4f %1$.5f\n", 3.141592, -5.23);

            System.out.printf("%1$10s %1$-20s %1$s %2$+3.3f %2$-4.5f %2$f\n", "고수지", 3.14592);

            System.out.printf("%1$tY %1$ty %1$tm %1$td %te %1$tA %1$ta %1$tB %1$tb ", new java.util.Date());
        }
    }