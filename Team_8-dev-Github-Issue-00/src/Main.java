import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1. 도서 정보 저장");
            System.out.println("2. 도서 검색");
            System.out.println("3. 도서 후기");
            System.out.println("4. 종료");
            System.out.print("입력: ");
            int option = sc.nextInt();
            sc.nextLine();
            System.out.println("--------------------------------");
            if (option == 1) {
                System.out.println("저자: ");
                String writer = sc.nextLine();

                System.out.println("도서명: ");
                String book_name = sc.nextLine();

                System.out.println("도서 번호: ");
                String book_number = sc.nextLine();

                System.out.println("줄거리: ");
                String plot = sc.nextLine();

            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("지원하지 않는 기능입니다.");
            }
        }
    }
}