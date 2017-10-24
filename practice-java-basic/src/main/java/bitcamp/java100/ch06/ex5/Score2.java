package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Score2 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    void inputScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름? ");
        this.name = scanner.nextLine();
        System.out.print("국어 점수? ");
        this.kor = scanner.nextInt();
        System.out.print("영어 점수? ");
        this.eng = scanner.nextInt();
        System.out.print("수학점수? ");
        this.math = scanner.nextInt();
        computeScore();
    }
    void computeScore() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    void printScore() {
        System.out.printf("%s %d %d %d %d %.2f\n", 
                this.name, this.kor, this.eng, this.math,
                this.sum, this.aver);
    }    
   

}
