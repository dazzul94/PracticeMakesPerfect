package bitcamp.java100;
    public class Test13_2 {
        public static void main(String[] args) {
            int[] arr1;
            int arr2[];
            arr1 = new int[3];
            arr2 = new int[4];
            arr1[0] = 100;
            arr1[1] = 100;
            arr1[2] = 100;
            arr2[0] = 100;
            arr2[1] = 100;
            arr2[2] = 100;
            arr2[3] = 100;
            for(int i = 0; i < arr1.length; i++) 
                System.out.println(arr1[i]);
            for(int i = 0; i < arr2.length; i++)
                System.out.println(arr2[i]);
        }
    }