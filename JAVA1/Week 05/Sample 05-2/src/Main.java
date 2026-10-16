import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int price;
    char grade; // V, G, S, N
    String gradeType;
    int discountRate;
    int discount;
    int lastPayment;

    System.out.printf("제품 가격 입력 : ");
    price = keyboard.nextInt();
    System.out.printf("회원 등급 입력(V,G,N,S) : ");
    grade = keyboard.next().charAt(0);

    // 대문자/소문자 입력 모두 처리 (Optional)
    grade = Character.toUpperCase(grade);

    gradeType = grade == 'V' ? "VIP" :
            (grade == 'G' ? "GOLD" :
                    (grade == 'S' ? "SILVER" : "NONE"));

    discountRate = grade == 'V' ? 20 :
            (grade == 'G' ? 15 :
                    (grade == 'S' ? 10 : 0));

    // 1. 기본 등급 할인 적용 후 금액
    discount = price - (int) (price * (discountRate / 100.0));

    // 2. 10만원 이상일 경우 추가 5% 할인 적용 (0.95 곱하기)
    lastPayment = discount >= 100000 ? (int) (discount * 0.95) : discount;

    System.out.println("=============================");
    System.out.printf("물품 가격 : %,d 원\n", price);
    System.out.printf("회원 등급 : %s (%d %% 할인)\n", gradeType, discountRate);
    System.out.printf("할인 가격 : %,d 원\n", discount);
    System.out.printf("결제 금액 : %,d 원\n", lastPayment);
}