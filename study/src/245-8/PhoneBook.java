import java.util.Scanner;

class Phone {
    String name;
    String tel;

    public void setUser(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public void show(String searchName) {
        System.out.println(searchName + "의 전화번호는 " + this.tel + "입니다.");
    }
}

class PhoneBook {

    public void run() {
        Scanner sc = new Scanner(System.in);
        Phone[] phones;
        String searchName = "";

        System.out.print("인원 수 >> ");
        phones = new Phone[sc.nextInt()];

        // 정보 입력
        for (int i = 0; i < phones.length; i++) {
            System.out.print("이름과 전화번호 빈칸 없이 입력 >> ");
            phones[i] = new Phone();
            phones[i].setUser(sc.next(), sc.next());
            System.out.println("정보 : " + phones[i].name + " " + phones[i].tel);
            sc.nextLine(); // 버퍼 클리어
        }
        System.out.println("저장 되었습니다.");

        // 검색 루프
        while (true) {
            System.out.print("검색 할 이름 >> ");
            searchName = sc.nextLine();

            if (searchName.equals("그만")) {
                System.out.println("종료합니다.");
                break;
            }

            boolean found = false;
            for (int i = 0; i < phones.length; i++) {
                if (searchName.equals(phones[i].name)) {
                    phones[i].show(searchName);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(searchName + "님은 없습니다.");
            }
        }
    }
}
