import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 변수 선언
        double weight;     // 지구에서의 몸무게 (입력값)
        double moonWeight; // 달에서의 몸무게 (계산값)

        // 1. 지구에서의 몸무게 입력받기
        System.out.print("당신의 몸무게(kg)를 입력하세요: ");
        weight = keyboard.nextDouble();

        // 2. 달에서의 몸무게 계산 (지구 중력의 약 16.5% = 0.165)
        moonWeight = weight * 0.165;

        // 3. 결과 출력
        System.out.println();
        System.out.printf("지구에서의 몸무게 : %.1f kg\n", weight);
        System.out.printf("달에서의 몸무게   : %.2f kg\n", moonWeight);

        keyboard.close();
    }
}