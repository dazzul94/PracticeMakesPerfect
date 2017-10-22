package ch03;

public class Test17_1 {
    static class Sweet {
        String name;
        String number;
        String address;
    }
    
    static void printSuji(Sweet s) {
        System.out.printf("이름: %s, 번호: %s, 주소: %s\n", s.name, s.number, s.address);
    }
    
    static Sweet initSuji(String name, String number, String address) {
        Sweet s = new Sweet();
        
        s.name = name;
        s.number = number;
        s.address = address;
        
        return s;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Sweet s1 = new Sweet(); 
        s1= initSuji("수지", "010-9896-1182","신내동 디아뜨갤러리 359호");
        Sweet s2 = new Sweet();
        s2 = initSuji("뚜디", "비밀번호 486", "다솔이 좌심방 판막옆");
        
        printSuji(s1);
        printSuji(s2);
    }

}
