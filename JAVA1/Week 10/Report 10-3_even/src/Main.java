void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    int[] rrn = new int[13];
    int[] weight = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
    String input, clean;
    int sum = 0;
    int checkCode;

    while (true) {
        System.out.print("주민등록번호 13자리 입력 (예: 660510-1321611) : ");
        input = keyboard.nextLine();
        clean = input.replace("-", "").trim();

        if (clean.length() == 13) {
            boolean isDigit = true;
            for (int i = 0; i < 13; i++) {
                if (clean.charAt(i) < '0' || clean.charAt(i) > '9') {
                    isDigit = false;
                    break;
                }
            }
            if (isDigit) break;
        }
        System.err.println("ERROR : 숫자 13자리를 정확히 입력하세요.");
        System.in.read();
    }

    for (int i = 0; i < 13; i++) {
        rrn[i] = clean.charAt(i) - '0';
    }

    for (int i = 0; i < 12; i++) {
        sum += rrn[i] * weight[i];
    }

    checkCode = 11 - (sum % 11);
    if (checkCode >= 10) {
        checkCode -= 10;
    }

    System.out.println("\n***********************************************");
    System.out.println("가중치 합계 : " + sum);
    System.out.println("계산된 검증 코드 : " + checkCode);
    System.out.println("입력된 마지막 자리 : " + rrn[12]);
    System.out.println("판별 결과 : " + (checkCode == rrn[12] ? "올바른 주민등록번호입니다." : "잘못된 주민등록번호입니다."));
    System.out.println("***********************************************");
    keyboard.close();
}