import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    double height;
    double totalDistance = 0;

    System.out.print("초기 높이 X(m)를 입력하세요: ");
    height = keyboard.nextDouble();

    for (int i = 1; i <= 10; i++) {
        System.out.printf("공의 %2d번째 낙하 높이: %.4f m\n", i, height);
        if (i == 1) {
            totalDistance += height;          // 첫 번째는 낙하 거리만 더함
        } else {
            totalDistance += (height * 2);    // 2번째부터는 튀어 오른 거리 + 낙하 거리
        }
        height = height * (2.0 / 3.0);        // 다음 높이는 2/3
    }

    System.out.printf("\n총 이동 거리: %.4f m\n", totalDistance);
}