import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Bear bear = new Bear(0, 0, 1);
    Fish fish = new Fish(7, 5, 1);

    System.out.println("**게임을 시작합니다.**");

    while (true) {
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 20; j++) {
          if (j == bear.getX() && i == bear.getY()) {
            System.out.print(bear.getShape());
          }
          else if (j == fish.getX() && i == fish.getY())
            System.out.print(fish.getShape());
          else
            System.out.print("-");
        }
        System.out.println();
      }
      
      bear.move();

      if (bear.collide(fish)) return;
    }

  }
}
