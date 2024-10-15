import java.util.Scanner;

public class MS {
  Scanner sc = new Scanner(System.in);

  Day[] days;

  public MS(int input) {
    this.days = new Day[input];
  };

  public void input(int day) {
    this.days[day].set(sc.nextLine());
  }

  public void view(int day) {
    this.days[day].show();
  }

  public void finish() {
    System.out.println("프로그램을 종료합니다.");
  }

  public void run() {
    System.out.println("이번달 스케쥴 관리 프로그램");
    boolean onPro = true;
    int userInput = 0, dayInput = 0;
    for (int i = 0; i < days.length; i++) {
      days[i] = new Day();
    }

    while (onPro) {
      System.out.print("할 일(입력 : 1, 보기 : 2, 끝내기 : 3) >> ");
      userInput = sc.nextInt();
      sc.nextLine();
      if (userInput == 1 || userInput == 2) {
        System.out.print("날짜(1 ~ 30) >> ");
        dayInput = sc.nextInt();
      }
      sc.nextLine();
      switch (userInput) {
        case 1:
          System.out.print("할 일(빈칸 없이 입력) >> ");
          days[dayInput].set(sc.nextLine());
          break;

        case 2:
          days[dayInput].show();
          break;

        case 3:
          finish();
          return;

        default:
          System.out.println("다시 입력하세요.");
          continue;
      }
    }
  }
}
