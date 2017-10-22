package bitcamp.java100;
    public class Test13_1 {
        public static void main(String[] args) {
            int kor, eng, math, soc, sci, eth, chi;
            kor = 100;
            eng = 100;
            math = 100;
            soc = 100;
            sci = 100;
            eth = 100;
            chi = 100;
            System.out.println(kor);
            System.out.println(eng);
            System.out.println(math);
            System.out.println(soc);
            System.out.println(eth);
            System.out.println(chi);

            int[] score;
            score = new int[] {100, 100, 100, 100, 100, 100};
            for(int i = 0; i < score.length; i++) {
                System.out.println(score[i]);
                //배열의 인덱스는 0부터 시작하므로 
                //같거나 작은게 아니라 작다고만 해야한다
            }
            
            
        }
    }