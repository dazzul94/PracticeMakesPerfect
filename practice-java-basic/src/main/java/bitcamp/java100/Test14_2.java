package bitcamp.java100;
    public class Test14_2{
        public static void main(String[] args) {
            class Book {
                String bookname;
                String author;
                int price;
            }
            Book b1 = new Book();
            b1.bookname = "수레바퀴 아래서";
            b1.author = "헤르만 헤세";
            b1.price = 10000;

            System.out.printf("%s %s %d", b1.bookname, b1.author, b1.price);
        }
    }