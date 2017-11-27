package bitcamp.java100;

import java.io.Console;

public class Test21_5_2 {

    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
     int i, j;
     i = Integer.parseInt(console.readLine("구구단?> "));
     if (i >= 10 || i == 1) {
         System.out.println("2단부터 9단까지만 가능");
     } else if (i == 0) {
         System.out.println("그만!");
     } else {
         for(j = 1; j <= 9; j++) {
             System.out.printf("%d * %d = %d\n", i, j, i * j);
         }
     }
    }
}
