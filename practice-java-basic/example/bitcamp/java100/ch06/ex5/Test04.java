package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Test04 {
    static boolean confirm(String message) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(message);
        String response = scanner.nextLine().toLowerCase();

        if(!(response.equals("y")||response.equals("yes"))) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        while(true) {
            Score1.inputScore();
            Score1.printScore();
            if(confirm("계속 입력하시겠습니까? (y/n)")) {
                break;
            }

        }
    }
}
