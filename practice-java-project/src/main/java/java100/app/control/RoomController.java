package java100.app.control;

import java.util.Iterator;

import java100.app.domain.Member;
import java100.app.domain.Room;
import java100.app.util.Prompts;

public class RoomController extends GeneralController<Room>{

    public void execution() {
        loop:
            while (true) {
                System.out.print("회원관리> ");
                String input = keyScan.nextLine();

                // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
                switch (input) {
                case "list": this.doList(); break;
                case "add": this.doAdd(); break;
                case "view": this.doView(); break;
                case "update": this.doUpdate(); break;
                case "delete": this.doDelete(); break;
                case "main": break loop;
                default: 
                    System.out.println("해당 명령이 없습니다.");
                }
            }
    }

    private void doList() {
        System.out.println("[회원 목록]");

        Iterator<Room> iterator = list.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            System.out.printf("%-4s, %s\n",  
                    room.getName(), 
                    room.getLocation());

        }
    }

    private void doAdd() {
        System.out.println("[회원 등록]");

        Room room = new Room();
        room.setName(Prompts.inputString("강의실 이름?" ));

        if (find(room.getName()) != null) {
            System.out.println("이미 등록된 강의실입니다.");
            return;
        }

        room.setLocation(Prompts.inputString("장소? "));
       room.setCapacity(Prompts.inputInt("수용인원? "));

        list.add(room);

    } 

    private void doView() {
        System.out.println("[강의실 상세 정보]");
        String email = Prompts.inputString("이메일? ");
        Member member = findByEmail(email);

        if(member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
            return;
        }
        System.out.printf("이름: %s\n", member.getName());
        System.out.printf("이메일: %s\n", member.getEmail());
        System.out.printf("암호: %s\n", member.getPassword());
    } 

    private void doUpdate() {
        System.out.println("[회원 변경]");
        String email = (Prompts.inputString("이메일? "));
        
        Member member = findByEmail(email);        
        if(member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", member.getEmail());
            return;
        }
        
        String name = Prompts.inputString("이름? ", member.getName());
            if (name.isEmpty()) {
                name = member.getName();
            }
            String password = Prompts.inputString("암호? ", member.getPassword());
            if (password.isEmpty()) {
                password = member.getPassword();
            }
            
            if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
                member.setName(name);
                member.setPassword(password);;
                System.out.println("변경하였습니다.");
                
            } else {
                System.out.println("변경을 취소하였습니다.");
        }    
    }
    
private void doDelete() {
    System.out.println("[회원 삭제]");
    String email = Prompts.inputString("이메일? ");

    Member member = findByEmail(email);

    if (member == null) {
        System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
    } else {
        if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
            list.remove(member);
            System.out.println("삭제하였습니다.");
        } else {
            System.out.println("삭제를 취소하였습니다.");
        }
    }
}
private Room find(String name) { 
    Iterator<Room> iterator = list.iterator();
    while (iterator.hasNext()) {
        Room room = iterator.next();
        if (room.getName().equals(name)) {
            return room;
        }
    }
    return null;
}
}
