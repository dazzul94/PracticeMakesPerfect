package bitcamp.java100.ch14.ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test1_4 {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("sample/jls9.pdf");
            BufferedInputStream bis = new BufferedInputStream(in);
            FileOutputStream out = new FileOutputStream("sample/jls92.pdf");
            BufferedOutputStream bos = new BufferedOutputStream(out);
            while (bis.read() != -1) {
                bos.write(bis.read());
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
