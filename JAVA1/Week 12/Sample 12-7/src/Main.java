//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    // 1. 수도 요금 기준
    final int BASIC = 1200;

    final String[] TYPE_NAME = {
            "", "가정용", "영업용", "공장용", "관공서", "군기관"
    };

    final int[] PRICE = {
            0, 40, 55, 78, 35, 20
    };

    final float[] TAX_RATE = {
            0.0f, 5.0f / 100, 3.5f / 100,
            2.5f / 100, 1.5f / 100, 0.0f / 100
    };


    // 2. Customer 클래스
    class Customer {

        String no;          // 수용가 번호
        String name;        // 이름
        char type;          // 수도 구분 코드
        String typeName;    // 수도 구분 이름
        double usage;       // 사용량
        int useCharge;      // 사용 요금
        int tax;             // 세금

        // 생성자
        Customer(String no, String name, char type, double usage) {

            this.no = no;
            this.name = name;
            this.type = type;
            this.usage = usage;

            this.typeName = TYPE_NAME[type - '0'];
        }
    }


    // 3. 프로그램 시작

    Scanner keyboard = new Scanner(System.in);


    // 4. 고객 객체 배열 생성
    Customer[] custom = {

            new Customer("1111", "홍길동", '1', 700.1),
            new Customer("2222", "이대한", '2', 56.7),
            new Customer("3333", "한국민", '5', 785.6),
            new Customer("1212", "이으뜸", '3', 345.7),
            new Customer("1313", "나이쁨", '4', 321.4),
            new Customer("4444", "김도령", '4', 789.6),
            new Customer("2121", "박대령", '1', 456.7),
            new Customer("4343", "허달수", '1', 678.4),
            new Customer("6789", "장마당", '4', 56.7),
            new Customer("4545", "정성길", '3', 895.6)

    };


    // 5. 수도 사용량 입력
    int count = 0;

    while (count < custom.length) {

        System.out.printf(
                "%s번 수도 사용량 입력 : ",
                custom[count].no
        );

        double inputUsage = keyboard.nextDouble();

        if (inputUsage < 0) {

            System.out.println("ERROR");

            continue;
        }

        custom[count].usage = inputUsage;

        count++;
    }


    // 6. 수도 요금 계산
    for (int i = 0; i < custom.length; i++) {

        // 사용량 반올림
        int temp = (int)(custom[i].usage + 0.5);

        // 수도 구분에 따른 요금 계산
        switch (custom[i].type) {

            case '1':
                custom[i].useCharge =
                        temp * PRICE[1] + BASIC;
                break;

            case '2':
                custom[i].useCharge =
                        temp * PRICE[2] + BASIC;
                break;

            case '3':
                custom[i].useCharge =
                        temp * PRICE[3] + BASIC;
                break;

            case '4':
                custom[i].useCharge =
                        temp * PRICE[4] + BASIC;
                break;

            case '5':
                custom[i].useCharge =
                        temp * PRICE[5] + BASIC;
                break;
        }

        // 세금 계산
        int typeIndex = custom[i].type - '0';

        custom[i].tax = Math.round(
                custom[i].useCharge * TAX_RATE[typeIndex]
        );
    }


    // 7. 납부액 기준 내림차순 정렬
    for (int i = 0; i < custom.length - 1; i++) {

        for (int j = i + 1; j < custom.length; j++) {

            int totalI =
                    custom[i].useCharge + custom[i].tax;

            int totalJ =
                    custom[j].useCharge + custom[j].tax;

            if (totalI < totalJ) {

                Customer temp = custom[i];

                custom[i] = custom[j];

                custom[j] = temp;
            }
        }
    }


    // 8. 최종 결과 출력
    System.out.println("\n\t\t수 도 요 금");

    System.out.println(
            "---------------------------------------------------------------"
    );

    System.out.printf(
            "%7s %4s %-6s %5s %9s %9s %8s %6s%n",
            "번호", "이름", "구분", "사용량",
            "사용금액", "TAX", "납부액", "비고"
    );

    System.out.println(
            "---------------------------------------------------------------"
    );


    for (int i = 0; i < custom.length; i++) {

        System.out.printf(
                "%7s %4s %-6s %5.1f %9d %9d %8d %6s%n",

                custom[i].no,
                custom[i].name,
                custom[i].typeName,
                custom[i].usage,
                custom[i].useCharge,
                custom[i].tax,
                custom[i].useCharge + custom[i].tax,

                custom[i].typeName.equals("군기관")
                        ? "일괄징수" : ""
        );
    }

    System.out.println(
            "---------------------------------------------------------------"
    );
}