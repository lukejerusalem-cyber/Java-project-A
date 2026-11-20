void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    int[] isbn = new int[12];
    int[] weight = {1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3};
    String input, clean;
    int sum = 0;
    int remainder, checkDigit;

    while (true) {
        System.out.print("ISBN 앞 12자리 입력 (예: 978-89-954321-0) : ");
        input = keyboard.nextLine();
        clean = input.replace("-", "").trim();

        if (clean.length() == 12) {
            boolean isDigit = true;
            for (int i = 0; i < 12; i++) {
                if (clean.charAt(i) < '0' || clean.charAt(i) > '9') {
                    isDigit = false;
                    break;
                }
            }
            if (isDigit) break;
        }
        System.err.println("ERROR : 숫자 12자리를 정확히 입력하세요.");
        System.in.read();
    }

    for (int i = 0; i < 12; i++) {
        isbn[i] = clean.charAt(i) - '0';
        sum += isbn[i] * weight[i];
    }

    remainder = sum % 10;
    checkDigit = (remainder == 0) ? 0 : (10 - remainder);

    System.out.println("\n***********************************************");
    System.out.println("가중치 합계 : " + sum);
    System.out.println("계산된 Check 기호 : " + checkDigit);
    System.out.println("완성된 ISBN-13 : " + input + "-" + checkDigit);
    System.out.println("유효성 검증 : " + ((sum + checkDigit) % 10 == 0 ? "유효한 ISBN입니다." : "오류"));
    System.out.println("***********************************************");
    keyboard.close();
}