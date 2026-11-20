void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    String[] name = {"홍길동", "이대한", "한민국", "경복대", "이미숙", "김철수", "박영희", "최민수", "정수진", "강호동"};
    double[] weight = new double[name.length];
    double sum = 0;
    double avg, rate;
    int count = 0;
    int i = 0;

    while (i < name.length) {
        System.out.printf("%s 학생 몸무게 입력 (30.0 ~ 120.0 Kg) : ", name[i]);
        weight[i] = keyboard.nextDouble();

        if (weight[i] >= 30.0 && weight[i] <= 120.0) {
            sum += weight[i];
            i++;
        } else {
            System.err.println("ERROR : 몸무게는 30.0 ~ 120.0 Kg 사이입니다.");
            System.in.read();
        }
    }

    avg = sum / weight.length;

    for (i = 0; i < weight.length; i++) {
        if (weight[i] >= avg) {
            count++;
        }
    }
    rate = (double) count / weight.length * 100;

    for (i = 0; i < weight.length - 1; i++) {
        for (int j = 0; j < weight.length - 1 - i; j++) {
            if (weight[j] < weight[j + 1]) {
                double tempW = weight[j];
                weight[j] = weight[j + 1];
                weight[j + 1] = tempW;

                String tempN = name[j];
                name[j] = name[j + 1];
                name[j + 1] = tempN;
            }
        }
    }

    System.out.println("\n***********************************************");
    System.out.printf("평균 몸무게 : %.1f Kg\n", avg);
    System.out.printf("평균 이상자 비율 : %.2f %%\n", rate);
    System.out.println("-----------------------------------------------");
    System.out.printf("상위 1명 : %s (%.1f Kg)\n", name[0], weight[0]);
    System.out.printf("상위 2명 : %s (%.1f Kg)\n", name[1], weight[1]);
    System.out.printf("하위 2명 : %s (%.1f Kg)\n", name[name.length - 2], weight[weight.length - 2]);
    System.out.printf("하위 1명 : %s (%.1f Kg)\n", name[name.length - 1], weight[weight.length - 1]);
    System.out.println("***********************************************");
    keyboard.close();
}