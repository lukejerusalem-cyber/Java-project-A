void main() {
    final int WELL_DEPTH = 300;   // 우물 깊이 3m = 300cm
    final int DAY_CLIMB = 55;     // 낮에 올라가는 거리 55cm
    final int NIGHT_SLIP = 13;    // 밤에 미끄러지는 거리 13cm
    final int FLOWER_DAYS = 7;    // 방울꽃이 시드는 기간 (일주일 = 7일)

    int height = 0;
    int day = 0;

    while (true) {
        day++;
        height += DAY_CLIMB;      // 낮 동안 열심히 올라간다
        System.out.printf("%d일째 낮 위치 : %3d cm\n", day, height);

        if (height >= WELL_DEPTH) { // 다 올라왔는가? (Y)
            break;
        }

        height -= NIGHT_SLIP;     // (N) 밤에 쉬면서 미끄러진다
        System.out.printf("%d일째 밤 위치 : %3d cm\n", day, height);
    }

    System.out.printf("\n달팽이는 %d일 만에 우물을 탈출했습니다.\n", day);
    if (day <= FLOWER_DAYS) {
        System.out.println("결과 : 방울꽃이 시들기 전에 곁을 지킬 수 있습니다!");
    } else {
        System.out.println("결과 : 방울꽃이 이미 시들어버렸습니다.");
    }
}