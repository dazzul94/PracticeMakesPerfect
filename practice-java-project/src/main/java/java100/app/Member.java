package java100.app;

public class Member {
    int num;
    String name;
    String password;
    
    void printScore() {
        System.out.printf("%s, %d, %d, %d, %d, %.2f\n", 
                name, kor, eng ,math, sum, aver);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getSum() {
        return sum;
    }
    public float getAver() {
        return aver;
    }

}
