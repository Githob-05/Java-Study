//예상 결과:
//매개변수생성자A30
//생성자B

class A {
  public A() {
    System.out.println("생성자 A");
  }
  public A(int x) {
    System.out.println("매개변수생성자A" + x);
  }
}

class B extends A {
  public B() {
    super(30);//super는 생성자 맨 첫줄
    System.out.println("생성자B");
  }
  public B(int x) {
    System.out.println("매개변수생성자B" + x);
  }
}

public class ConstructorEx5 {
  public static void main(String[] args) {
    B b;
    b = new B();
  }
}


