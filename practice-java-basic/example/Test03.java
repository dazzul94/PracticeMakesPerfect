class Test03 {
    public static void main (String[] args) {
        System.out.println("안녕하세요!");
        // 소스파일 분리하기 (1)
        // java-basic> javac -d bin -encoding utf8 src\main\java\Test03.java
        //           > java -cp bin src\main\java\Test03
        
        //           > set CLASSPATH=bin
        //           > java Test03  
    }
}