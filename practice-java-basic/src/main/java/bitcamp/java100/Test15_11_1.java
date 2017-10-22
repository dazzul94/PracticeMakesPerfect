package bitcamp.java100;

public class Test15_11_1 {
    static Privilege initP(boolean isDirectory, 
                      boolean ownerRead, 
                      boolean ownerWrite,
                      boolean ownerExe,
                      boolean groupRead,
                      boolean groupWrite,
                      boolean groupExe,
                      boolean otherRead,
                      boolean otherWrite,
                      boolean otherExe) {
        Privilege p1 = new Privilege();
        p1.isDirectory = isDirectory;
        p1.ownerRead = ownerRead;
        p1.ownerWrite = ownerWrite;
        p1.ownerExe = ownerExe;
        p1.groupRead = groupRead;
        p1.groupWrite = groupWrite;
        p1.groupExe = groupExe;
        p1.otherRead = otherRead;
        p1.otherWrite = otherWrite;
        p1.otherExe = otherExe;
        
        return p1;
        
    }
    
    static void printP(Privilege p1) {
        System.out.print(p1.isDirectory ? "d" : "-");
        System.out.print(p1.ownerRead ? "r" : "-");
        System.out.print(p1.ownerWrite ? "w" : "-");
        System.out.print(p1.ownerExe ? "x" : "-");
        System.out.print(p1.groupRead ? "r" : "-");
        System.out.print(p1.groupWrite ? "w" : "-");
        System.out.print(p1.groupExe ? "x" : "-");
        System.out.print(p1.otherRead ? "r" : "-");
        System.out.print(p1.otherWrite ? "w" : "-");
        System.out.print(p1.otherExe ? "x" : "-");
        System.out.println();
    }

    public static void main(String[] args) {

        Privilege p1 = initP(false, true, true, true, true, false, true, true, false, true);

        printP(p1);
    }
}
