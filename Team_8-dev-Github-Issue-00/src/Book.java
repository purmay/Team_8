import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String writer;
    String name;
    String number;
    String plot;

    Scanner sc = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    public Book(String writer, String name, String number, String plot) {
        this.writer = writer;
        this.name = name;
        this.number = number;
        this.plot = plot;
    }

    public void BookSave() {
        while(true) {
            System.out.print("저자 (종료 0): ");
            String writer = sc.nextLine();
            if (writer.equals("0"))
                break;
            System.out.print("도서명: ");
            String book_name = sc.nextLine();

            System.out.print("도서 번호: ");
            String book_number = sc.nextLine();

            System.out.print("줄거리: ");
            String plot = sc.nextLine();

            books.add(new Book(writer, book_name, book_number, plot));
            System.out.println("도서가 저장되었습니다!");
        }
    }

    public void BookSearch() {
        while(true) {
            System.out.print("검색할 도서명 입력 (종료 0): ");
            String keyword = sc.nextLine();
            if (keyword.equals("0"))
                break;
            boolean found = false;

            for (Book b : books) {
                if (b.name.contains(keyword)) {
                    System.out.println("==== 검색 결과 ====");
                    System.out.println("저자: " + b.writer);
                    System.out.println("도서명: " + b.name);
                    System.out.println("도서 번호: " + b.number);
                    System.out.println("줄거리: " + b.plot);
                    System.out.println("-----------------");
                    found = true;
                }
                if (!found) System.out.println("검색 결과가 없습니다.");
            }
        }
    }
}