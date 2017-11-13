package bitcamp.java100.ch09.ex2;

public class LinkedList {
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
        
        if (len == 0) {
            head = box;
            tail = box;
            len++;
            return;
        }
        tail.next = box;
        len++;
    }

    int size() {
        return len;
    }

    Object get(int index) {
        if (index < 0 || index >= len) {
            return null;
        }
        Box box = new Box();
        if(index == 0) {
            box = head;
            return box.value;
        }

        box = head;
        for(int count = 1; count <= index; count++) {
            box = box.next;
        }
        return box.value;
    }
    void insert(Object value, int index) {
        if (index < 0 || index >= len) {
            return;
        }
        Box box = new Box(value);

        len++;
        
        if(index == 0) {
            box.next = head;
            head = box;
            return;
        }
        Box pre = head;
        for(int count = 1; count < index; count++) {
            pre = pre.next;
        }
        box.next = pre.next;
        pre.next = box;
        return;
    }
    
    Object remove(int index) {
        Box removedBox;
        len--;
        if (index < 0 || index >= len) {
            return null;
        }
        if (index == 0) {
            removedBox = head;
            head = head.next;
            return removedBox.value;
        }

        Box pre = head;
        for(int count = 1; count < index; count++) {
            pre = pre.next;
        }
        removedBox = pre.next;
        pre.next = pre.next.next;
        if(index == len -1) {
            tail = pre;
        }
        return removedBox.value;
    }

}
