import java.util.Scanner;

public class Bear extends GameObject {
  
  public Bear(int x, int y, int distance) {
    super(x, y, distance);
  }

  @Override
  public void move() {
    Scanner sc = new Scanner(System.in);
    System.out.print("w,a,s,d로 이동");
    char userInput = sc.nextLine().charAt(0);

    switch (userInput) {
      case 'w' :
        y -= distance;
        break;

      case 'a' :
        x -= distance;
        break;

      case 's' :
        y += distance;
        break;

      case 'd' :
        x += distance;
        break;

      default :
        System.out.println("다시 입력하시오.");
        break;
    }

    // 그리드 밖으로 나가는 걸 방지
    if (x < 0) x = 0;
    if (x > 19) x = 19;
    if (y < 0) y = 0;
    if (y > 9) y = 9;

  }

  @Override
  public char getShape() {
    return 'B';
  }
}
