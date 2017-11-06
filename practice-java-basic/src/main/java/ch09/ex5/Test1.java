package ch09.ex5;

public class Test1 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        
        queue.add("김다솔");
        queue.add("고수지");
        queue.add("김이든");
        queue.add("이보미");
        
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

}
