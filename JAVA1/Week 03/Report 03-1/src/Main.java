import java.util.Scanner; // 입력을 받기 위한 Scanner 클래스 임포트

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 ");
        int num1 = scanner.nextInt(); // 첫 번째 정수 입력

        System.out.print("두번째 숫자를 입력하세요 ");
        int num2 = scanner.nextInt(); // 두 번째 정수 입력

        int sum = num1 + num2; // 두 수의 합 계산

        System.out.println(num1 + " + " + num2 + " = " + sum);

        scanner.close();
    }
}