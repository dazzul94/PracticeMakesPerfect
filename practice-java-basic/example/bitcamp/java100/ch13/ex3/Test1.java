package bitcamp.java100.ch13.ex3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader("./build.gradle");
            int ch;
            while(true) {
                ch = in.read();
                if (ch == -1) break;
                System.out.print((char)ch);
            }
            System.out.println("-------------------------");
        } catch (Exception e) {
            System.out.println("파일 읽기 중 오류 발생");
        } finally {
            System.out.println("finally 블록 실행!");
            try {
                in.close();
            } catch (IOException e) {
            }
        }
        
    }

}
