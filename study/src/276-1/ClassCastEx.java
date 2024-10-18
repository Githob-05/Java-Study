class A {
  int i;
  int j;
}
class B extends A {
  int k;
  int l;
}

public class ClassCastEx {
  public static void main(String[] args) {
    A a = new B();
    B b = (B)a;
    if (a instanceof b) // 변수명 instanceof 클래스명
      System.out.print("go");
    if (b instanceof A) 
      System.out.print("stop");
  }
}
