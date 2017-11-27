package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Test01 {

    static String name;
    static int kor;
    static int eng;
    static int math;
    static int sum;
    static float aver;

    static void inputScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름? ");
        name = scanner.nextLine();
        System.out.print("국어 점수? ");
        kor = scanner.nextInt();
        System.out.print("영어 점수? ");
        eng = scanner.nextInt();
        System.out.print("수학점수? ");
        math = scanner.nextInt();
        computeScore();
    }
    static void computeScore() {
        sum = kor + eng + math;
        aver = sum / 3f;
    }
    static void printScore() {
        System.out.printf("%s %d %d %d %d %.2f\n", name, kor, eng, math, sum, aver);
    }    

    public static void main(String[] args) {
        inputScore();
        printScore();

    }

}
