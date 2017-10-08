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
    }
}
