void main() {
    final int TOTAL_HEAD = 37;
    final int TOTAL_LEG = 102;
    int chicken, dog;

    // 1. for문 이용
    for (chicken = 0; chicken <= TOTAL_HEAD; chicken++) {
        dog = TOTAL_HEAD - chicken;
        if (chicken * 2 + dog * 4 == TOTAL_LEG) {
            System.out.printf("[for문]      닭 : %d 마리, 개 : %d 마리\n", chicken, dog);
        }
    }

    // 2. while문 이용
    chicken = 0;
    while (chicken <= TOTAL_HEAD) {
        dog = TOTAL_HEAD - chicken;
        if (chicken * 2 + dog * 4 == TOTAL_LEG) {
            System.out.printf("[while문]    닭 : %d 마리, 개 : %d 마리\n", chicken, dog);
        }
        chicken++;
    }

    // 3. do-while문 이용
    chicken = 0;
    do {
        dog = TOTAL_HEAD - chicken;
        if (chicken * 2 + dog * 4 == TOTAL_LEG) {
            System.out.printf("[do-while문] 닭 : %d 마리, 개 : %d 마리\n", chicken, dog);
        }
        chicken++;
    } while (chicken <= TOTAL_HEAD);
}