import java.util.Scanner;

public class ConcertBook {
  
  public void run() {
    Scanner sc = new Scanner(System.in);
    int userInput = 0;


    System.out.println("콘서트 홀 예약 시스템 입니다.");
    while (true) {
      System.out.print("예약: 1, 조회: 2, 취소: 3, 끝내기: 4 >> ");
      userInput = sc.nextInt();
      sc.nextLine();

      switch (userInput) {
        case 1:
          
          break;

        case 2:
          
          break;

        case 3:
          
          break;

        case 4:
        
          break;
      
        default:

          break;
      }
    }
  }
}
