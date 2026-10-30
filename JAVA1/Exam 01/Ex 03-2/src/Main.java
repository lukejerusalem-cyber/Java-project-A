void main() {
    Scanner keyboard = new Scanner(System.in);
    int expense;     // 지출액
    int savings;     // 저축액
    int foodExpense; // 식 생활비
    double engelIndex; // 엠겔 지수
    String grade;    // 계층 판정 결과
    String result;

    System.out.println("**** 엠겔 지수 계산 ****");
    System.out.print("지출액 입력 : ");
    expense = keyboard.nextInt();
    System.out.print("저축액 입력 : ");
    savings = keyboard.nextInt();

    if (expense > 0 && savings >= 0 && expense >= savings) {
        // 식 생활비 = 지출액 - 저축액
        foodExpense = expense - savings;

        // 엠겔 지수 = 식 생활비 / 지출액 * 100
        engelIndex = ((double) foodExpense / expense) * 100;

        // 엠겔 지수 판정
        if (engelIndex <= 30) {
            grade = "상류층";
        } else if (engelIndex <= 50) {
            grade = "중산층";
        } else {
            grade = "하류층";
        }

        result = String.format("\n식 생활비 : %,d 원\n엠겔 지수 : %.2f %%\n당신은 %s 입니다.\n",
                foodExpense, engelIndex, grade);
    } else {
        result = "\nERROR : 입력 데이터 오류입니다.\n";
    }

    System.out.println(result);
}