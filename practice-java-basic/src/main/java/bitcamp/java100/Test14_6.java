package bitcamp.java100;
    public class Test14_6{
        public static void main(String[] args) {
          class Score {
              String name;
              int kor;
              int eng;
              int math;
              int sum;
              float aver;
              void compute() {
                  sum = kor + eng + math;
                  aver = sum / 3.0f;
              }
          }
          Score[] score = new Score[3];
          score[0] = new Score();
          score[1] = new Score();
          score[2] = new Score();

          score[0].name = "고수지";
          score[0].kor = 100;
          score[0].eng = 100;
          score[0].math = 100;
          
          score[1].name = "김다솔";
          score[1].kor = 100;
          score[1].eng = 100;
          score[1].math = 100;

          score[2].name = "피카츄";
          score[2].kor = 100;
          score[2].eng = 100;
          score[2].math = 100;

          for(int i = 0; i < score.length; i++) {
              System.out.printf("%s %d %d %d %d %f\n",score[i].name, score[i].kor, score[i].eng, score[i].math, score[i].sum, score[i].aver);
          }

        }
    }