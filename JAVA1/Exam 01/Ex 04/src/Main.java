void main() {
    Scanner keyboard = new Scanner(System.in);
    int a, b, c;
    String type = "";
    double s, area;

    System.out.print("첫 번째 변 a : ");
    a = keyboard.nextInt();
    System.out.print("두 번째 변 b : ");
    b = keyboard.nextInt();
    System.out.print("세 번째 변 c : ");
    c = keyboard.nextInt();

    // 삼각형 성립 조건 검사
    if (a + b > c && a + c > b && b + c > a) {
        System.out.println("삼각형이 성립합니다.");

        // 직각 삼각형 판정 조건 (피타고라스 정리)
        boolean isRight = (a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a);

        // 삼각형 종류 구별
        if (a == b && b == c) {
            type = "정 삼각형";
        } else if (a == b || b == c || a == c) {
            type = "이등변 삼각형";
        } else if (isRight) {
            type = "일반 삼각형 (직각 삼각형)";
        } else {
            type = "일반 삼각형";
        }

        // 헤론의 공식을 이용한 면적 계산 (Math.sqrt 사용)
        s = (a + b + c) / 2.0;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("삼각형의 종류 : %s\n", type);
        System.out.printf("삼각형의 면적 : %.2f \u33a0\n", area);
    } else {
        System.out.println("삼각형이 성립하지 않습니다.");
    }
}