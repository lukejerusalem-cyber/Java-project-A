//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);


    double 판매금액;
    double 금액;
    double 세금;

    System.out.print("판매 금액은?");
    판매금액 = keyboard.nextDouble();

    세금 = 판매금액 * 0.1;
    금액 = 판매금액 - 세금;

    System.out.printf("판매금액은 : %,.0f원\n", 판매금액);
    System.out.printf("금액은 : %,.0f원\n", 금액);
    System.out.printf("세금은 : %,.0f원\n", 세금);
}