public class Fish extends GameObject {

  public Fish(int x, int y, int distance) {
    super(x, y, distance);
  }

  @Override
  public void move() {

  }
  
  @Override
  public char getShape() {
    return '#';
  }
}
