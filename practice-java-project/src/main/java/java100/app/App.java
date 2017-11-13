package java100.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    
    static Scanner keyScan = new Scanner(System.in);
    
    static String confirm(String message) {
        System.out.print(message);
        return keyScan.nextLine();
    }
    static Boolean confirm2(String message) {
        String response = confirm(message).toLowerCase();
        if((response.equals("y")) || (response.equals("yes")))
            return true;
        return false;
        
    }
    
    
    public static void main(String[] args) {
        ArrayList<Score> list = new ArrayList<>();
        
        while(true) {
        Score score = new Score();

        score.name = confirm("이름? ");
        score.kor = Integer.parseInt(confirm("국어? "));
        score.eng = Integer.parseInt(confirm("영어? "));
        score.math = Integer.parseInt(confirm("수학? "));
        
        score.compute();
        list.add(score);
        
        if(!confirm2("계속 하시겠습니까? "))
            break;
        }
        Iterator<Score> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next().printScore();
        }
    }

}
