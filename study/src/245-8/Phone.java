class Phone {
  String name;
  String tel;

  public void setUser(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

  public void show(String name) {
    System.out.println(name + "님 전화번호 : " + this.tel );
  }
}
