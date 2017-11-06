package java100.app;
import java.util.Scanner;

public class Score {
    protected String name;
    protected int[] subjects = new int[3];
    protected int sum;
    protected float aver;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.compute();
    }

    public int[] getSubjects() {
        return subjects;
    }

    public void setSubjects(int kor, int eng, int math) {
        this.subjects[0] = kor;
        this.subjects[1] = eng;
        this.subjects[2] = math;
    }

    Score() {}
    
    Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects[0] = kor;
        this.subjects[1] = eng;
        this.subjects[2] = math;
        
        this.compute();
    }
    
    void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0], 
                this.subjects[1],
                this.subjects[2],
                this.sum,
                this.aver);
    }
    private void compute() {
        for(int sub : this.subjects) {
            this.sum += sub;
            this.aver = this.sum / (float)this.subjects.length;
        }
    }
    void input() {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        System.out.print("국어? ");
        this.subjects[0] = keyScan.nextInt();
        System.out.print("영어? ");
        this.subjects[1] = keyScan.nextInt();
        System.out.print("수학? ");
        this.subjects[2] = keyScan.nextInt();
        
        this.compute();
        
        
    }

}
