
class Seat {
  char rank;
  String[] location;

  public Seat(char rank) {
    this.rank = rank;
    this.location = new String[] {"---","---","---","---","---","---","---","---","---","---"};
}

  public void setSeat() {
    System.out.print(rank + ">> ");
    for (int i = 0; i < location.length; i++) {
      System.out.print(location);
    }
  }
}
