void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    double[] score = new double[7];
    double sum = 0;
    double max = 60.0;
    double min = 100.0;
    int i = 0;

    while (i < score.length) {
        System.out.print((i + 1) + "번째 심사위원 점수 (60.0 ~ 100.0) : ");
        score[i] = keyboard.nextDouble();

        if (score[i] >= 60.0 && score[i] <= 100.0) {
            sum += score[i];
            if (score[i] > max) max = score[i];
            if (score[i] < min) min = score[i];
            i++;
        } else {
            System.err.println("ERROR : 점수는 60.0 ~ 100.0 사이입니다.");
            System.in.read();
        }
    }

    double result = (sum - max - min) / (score.length - 2);

    System.out.println("\n***********************************");
    System.out.printf("최고 점수 : %.1f점\n", max);
    System.out.printf("최저 점수 : %.1f점\n", min);
    System.out.printf("홍길동 선수 최종 점수 : %.2f점\n", result);
    System.out.println("***********************************");
    keyboard.close();
}