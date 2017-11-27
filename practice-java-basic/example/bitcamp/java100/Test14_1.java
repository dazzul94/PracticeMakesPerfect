package bitcamp.java100;
    public class Test14_1{
        public static void main(String[] args) {
          class Scores {
              String names;
              int kor;
              int eng;
              int math;
              int sum;
              float aver;
          }
          Scores r1 = new Scores();
          r1.names = "고수지";
          r1.kor = 100;
          r1.eng = 100;
          r1.math = 100;
          r1.sum = r1.kor + r1.eng + r1.math;
          r1.aver = r1.sum / 3.0f;

          System.out.printf("%s %d %d %d %d %f", r1.names, r1.kor, r1.eng, r1.math, r1.sum, r1.aver);

        }
    }