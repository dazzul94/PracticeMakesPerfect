//: ## ver 18
//: - 기능 추가: 변경, 삭제 기능을 추가하라!
//: - 요구사항
//:   - App.java 클래스의 주석을 확인하라!
//: 
//: 
/*

성적관리> add
이름? 홍길동
국어? 100
영어? 100
수학? 100
계속 입력하시겠습니까?(Y/n) <== 'Y' 또는 'y', 그냥 엔터치기 
이름? 임꺽정
국어? 90
영어? 90
수학? 90
계속 입력하시겠습니까?(Y/n) n

성적관리> list
홍길동, 300, 100.0
임꺽정, 270, 90.0
성적관리> view
이름? 홍길동
홍길동, 100, 100, 100, 300, 100.0

성적관리> view
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.
성적관리> delete
이름? 홍길동
정말 삭제하시겠습니까?(y/N) y <== 'Y', 'y'를 입력해야 삭제된다.
삭제하였습니다.

성적관리> delete
이름? 임꺽정
정말 삭제하시겠습니까?(y/N) n
삭제취소하였습니다.

성적관리> delete
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.

성적관리> update
이름? 홍길동
국어?(100) 80    <== 엔터를 치면 원래 점수 유지
영어?(100) 
수학?(100) 90
변경하시겠습니까?(y/N) y<== 'Y', 'y'를 입력해야 변경된다.
변경하였습니다.

성적관리> update
이름? 홍길동
국어?(100) 80    <== 엔터를 치면 원래 점수 유지
영어?(100) 
수학?(100) 90
변경하시겠습니까?(y/N) n<== 'Y', 'y'를 입력해야 변경된다.
변경취소하였습니다.

성적관리> update
이름? 우헤헤
'우헤헤'의 성적 정보가 없습니다.

성적관리> remove
수행할 수 없는 명령입니다.

성적관리> quit
프로그램을 종료합니다.

 */
package important;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// 1단계 
// => "성적관리>" 프롬프트를 출력하여 사용자로부터 입력을 받는다.
public class App01 {
    static Scanner keyScan = new Scanner(System.in);

    static String prompts(String message) {
        System.out.print(message);
        return keyScan.nextLine();

    }


    static boolean confirm(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();

        if (response.equals("y") || response.equals("yes") ||
                response.equals(""))
            return true;
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Score> list = new ArrayList<>();
        Iterator<Score> iterator;


        while(true) {
            System.out.print("성적관리> ");
            String input = keyScan.nextLine();

            switch (input) {
            case "add" : 
                while(true) {
                    System.out.println("[학생 등록]");
                    Score score = new Score();
                    score.input(); 
                    list.add(score);
                    if(!confirm("계속 입력하시겠습니까? (Y/n) "))
                        break;
                }
                break;
            case "list" :
                System.out.println("[학생 목록]");
                iterator = list.iterator();
                // 1) ArrayList로부터 "데이터를 꺼내주는 일을 할 객체"를 얻는다.
                // 2) "데이터를 꺼내주는 일을 할 객체"를 통해 값을 꺼낸다.
                while (iterator.hasNext()) {
                    iterator.next().print();
                }
                break;
            case "view" :
                System.out.println("[학생 정보]");
                String name = prompts("이름? ");
                iterator = list.iterator();
                while(iterator.hasNext()) {
                    if(name.equals(iterator.next().name)) {
                        iterator.next().printDetail();
                    } else {
                        System.out.printf("%s의 성적 정보가 없습니다", name);
                    }
                }
                break;
            case "update" :
                System.out.println("[학생 정보 변경]");
                break;
            case "delete" :
                System.out.println("[학생 삭제]");
                break;
            case "quit" :
                System.out.println("프로그램을 종료합니다");
                break;
            default :
                System.out.println("실행할 수 없는 명령입니다");
            }
            System.out.println();
        }

    }
}

