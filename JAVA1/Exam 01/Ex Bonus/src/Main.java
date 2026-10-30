void main() {
    final int COST = 1015000;            // 매입 원가
    final double PROFIT_RATE = 0.30;     // 이익률 30%
    final double TAX_RATE = 0.10;        // 세율 10%

    int price;       // 정가 (매출액)
    int salesTax;    // 매출 세액
    int purchaseTax; // 매입 세액
    int payTax;      // 납부 세액

    // 1. 정가 = 매입원가 * (1 + 이익률)
    price = (int) (COST * (1 + PROFIT_RATE));

    // 2. 매출 세액 = 매출액 * 세율 (10%)
    salesTax = (int) (price * TAX_RATE);

    // 3. 매입 세액 = 매입액 * 세율 (10%)
    purchaseTax = (int) (COST * TAX_RATE);

    // 4. 납부 세액 = 매출세액 - 매입세액
    payTax = salesTax - purchaseTax;

    System.out.println("**** 보너스 문제 : 납부 세액 계산 ****\n");
    System.out.printf("매입 원가 : %,d 원\n", COST);
    System.out.printf("정가(매출액) : %,d 원\n", price);
    System.out.printf("매출 세액 : %,d 원\n", salesTax);
    System.out.printf("매입 세액 : %,d 원\n", purchaseTax);
    System.out.println("------------------------------");
    System.out.printf("관할 세무서에 낼 납부 세액 : %,d 원\n", payTax);
}