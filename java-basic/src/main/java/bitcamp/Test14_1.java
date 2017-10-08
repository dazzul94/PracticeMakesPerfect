package bitcamp.java100;
    public class Test14_1{
        public static void main(String[] args) {
            class Score {
                String names;
                int kor;
                int eng;
                int math;
                int sum;
                float aver;
            }
            Score r1;
            r1 = new Score();
            r1.names = "김다솔";
            r1.kor = 100;
            r1.eng = 100;
            r1.math = 100;
            r1.sum = r1.kor + r1.eng + r1.math;
            r1.aver = r1.sum /3.0f;
            
            System.out.printf("%s %d %d %d %d %.1f\n", r1.names, r1.kor, r1.eng, r1.math, r1.sum, r1.aver);
        }
    }