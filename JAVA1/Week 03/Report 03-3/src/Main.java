import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("섭씨 온도를 입력하세요 (℃): ");
        double celsius = scanner.nextDouble(); // 섭씨 입력

        // 화씨 변환 공식 적용
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.println("섭씨 " + celsius + "℃는 화씨 " + fahrenheit + "℉ 입니다.");

        scanner.close();
    }
}