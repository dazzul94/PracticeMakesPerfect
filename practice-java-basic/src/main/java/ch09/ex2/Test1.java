package ch09.ex2;

public class Test1 {
    static void print(LinkedList list) {
        System.out.printf("list의 크기 : %d\n",list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d: %s ", i, list.get(i));
        }
        System.out.println();
        
        
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("김다솔");
        list.add("고수지");

        print(list);
        
        list.insert("김이든", 1);
        list.insert("이보미", 2);
        print(list);
        
        list.remove(2);
        print(list);
        
    }

}
