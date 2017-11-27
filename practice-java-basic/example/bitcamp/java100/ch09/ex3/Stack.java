package bitcamp.java100.ch09.ex3;

public class Stack {
    private class Box {
        Object value;
        Box pre;

        Box() {}

        Box(Object value) {
            this.value = value;
        }
    }

    Box top;
    int len;


    void push(Object value) {
        Box box = new Box(value);
        box.pre = top;
        top = box;
        len++;
    }
    int size() {
        return  len;
    }
    Object pop() {
        if(len <= 0) {
            return null;
        }
        Box removedBox = top;
        top = top.pre;
        len--;
        return removedBox.value;
        
    }

}
