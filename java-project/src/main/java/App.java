<<<<<<< Updated upstream
public class App {
       public static void main(String[] args) {
        String[] names = {"홍길동", "임꺽정", "유관순"};
        int[] kor = {100, 80, 100};
        int[] math = {90, 80, 100};
        int[] eng = {80, 80, 100};
        for(int i = 0; i < 3; i++) {
            // 3대신 names.length 나 kor.length 나 가능
            int sum = kor[i] + math[i] + eng[i];
            float aver = sum / 3.0f;
            System.out.printf("%s %d %d %d %d %.1f\n", names[i], kor[i], math[i], eng[i] , sum, aver);
        }
=======
// ## ver 03
// 변수를 이용하여 이름, 국어, 영어, 수학, 총점, 합계를 저장하라!그런 후 다음과 같이 출력하라!

// 출력 내용:
// ```
// 이름: 홍길동
// 국어: 100
// 영어: 100
// 수학: 100
// 총점: 300
// 평균: 100.0
public class App {
    public static void main(String [] args) {
      
>>>>>>> Stashed changes
    }
}
