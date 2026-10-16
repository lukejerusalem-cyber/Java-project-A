import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int width;  // 가로
        int length; // 세로
        int height; // 높이
        double vol; // 부피

        // 입력 받기
        System.out.print("직육면체의 가로 세로 높이 입력: ");
        width = keyboard.nextInt();
        length = keyboard.nextInt();
        height = keyboard.nextInt();

        // 부피 계산
        vol = (double) width * length * height;

        // 결과 출력
        System.out.printf("직육면체 가로 = %d Cm\n", width);
        System.out.printf("직육면체 세로 = %d Cm\n", length);
        System.out.printf("직육면체 높이 = %d Cm\n", height);
        System.out.printf("직육면체 부피 = %.0f Cm\n", vol);

        keyboard.close();
    }
}