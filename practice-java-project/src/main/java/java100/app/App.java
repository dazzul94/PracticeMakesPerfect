package java100.app;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    private static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String input = keyScan.nextLine().toLowerCase();
        if(input.equals("y")|| input.equals("yes"))
            return true;
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Score> list = new ArrayList<>();
        Scanner keyScan = new Scanner(System.in);
        Iterator<Score> iterator;
        Loop:
            while(true) {
                System.out.print("성적관리>");
                String input = keyScan.nextLine();
                switch(input) {
                case "add" : 
                    System.out.println("[성적 등록]");

                    while(true) {
                        Score score = new Score();
                        score.input();
                        list.add(score);

                        if(!confirm("계속 하시겠습니까?(Y/n) ")) {
                            break;
                        }
                    }
                    break;

                case "list" : 
                    System.out.println("[성적 목록]");
                    iterator = list.iterator();
                    while(iterator.hasNext())
                        iterator.next().print();
                    break;

                case "view" : 
                    System.out.println("[성적 정보]");

                    System.out.print("이름? ");
                    input = keyScan.nextLine();

                    Score score = null;
                    iterator = list.iterator();

                    while(iterator.hasNext()) {
                        
                        if (iterator.next().name.equals(input)) {
                            score = iterator.next();
                            break; //찾으면 나간다!
                        }  
                    }
                    if (score == null) {
                        System.out.printf("%s 의 성적 정보가 없습니다\n",input);
                    } else {
                        score.print();
                    }
                    break;
                case "delete" : System.out.println("delete");
                break;
                case "update" : System.out.println("update");
                break;
                case "quit" : System.out.println("quit");
                break Loop;
                default: System.out.println("수행할 수 없는 명령입니다"); 
                }
                System.out.println();
            }




        /*  ArrayList<Score> list = new ArrayList<>();

        while(true) {

            Score score = new Score();
            score.input();
            list.add(score);

            if(!confirm("계속 하시겠습니까?")) {
                break;
            }
        }

        Iterator<Score> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next().print();
        }
         */
    }

}




