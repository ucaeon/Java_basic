package construct.ex;

import construct.MemberConstruct;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book();

        Book book2 = new Book("Hello Java", "Seo");

        Book book3 = new Book("JPA 프로그래밍", "kim", 700);

        Book[] books = {book1, book2, book3};

        for (Book s : books) {
            System.out.println("제목: " + s.title + " 저자: " + s.author + " 페이지: " + s.page);
        }
    }
}
