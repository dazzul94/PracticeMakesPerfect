package bitcamp.java100;
    public class Test13_7 {
        public static void main(String[] args) {
            int a = 100;
            int b;
            b = a;
            b = 200;
            System.out.printf("%d %d\n", a, b);

            int[] arr1 = new int[3];
            int[] arr2 = new int[4];
            arr2 = arr1;
            arr2[1] = 50;
            System.out.printf("%d %d %d\n", arr1[0], arr1[1], arr1[2]);
            //레퍼런스는 주소값을 저장하는 것이기 때문에
            //같은 주소를 공유하는 것이다!!!!
            //arr2에 arr1의 주소를 저장하고 배열 각각의 값을 변화시키면 
            //arr1 과 arr2의 주소에 해당하는 배열의 각각의 값이 변하는 것이기 때문에
            //다 바뀐다!!!!!주소값은 동일
        }
    }