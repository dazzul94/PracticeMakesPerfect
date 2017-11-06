package ch09.ex5;

public class Queue {
    private class Box {
        Object value;
        Box next;

        Box() {}
        Box(Object value) {
            this.value = value;
        }
    }
    Box head;
    Box tail;
    int len;

    void add(Object value) {
        Box box = new Box(value);

        if(tail == null) { 
            tail = box;
            head = box;
        }
        if(tail != null) { 
            tail.next = box;
            tail = box;
        }
        len++;


    }

    Object poll()  {
        if(len == 0) 
            return null;

        Box removedBox = head;

        head = head.next;
        len--;
        return removedBox.value;
    }



}
