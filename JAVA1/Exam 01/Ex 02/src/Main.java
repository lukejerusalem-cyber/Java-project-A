void main() {
    Scanner keyboard = new Scanner(System.in);
    int age;
    int fee;
    boolean flag;
    String result;

    System.out.println("**** 체육관 입장료 계산 ****");
    System.out.print("나이 입력 : ");
    age = keyboard.nextInt();

    // 유효성 검사 (나이는 0세 이상 120세 이하)
    flag = (age >= 0 && age <= 120) ? true : false;

    // 반드시 조건 연산자(삼항 연산자)를 활용한 요금 계산
    fee = (age >= 18) ? 4000 :
            ((age >= 13) ? 3000 :
                    ((age >= 7) ? 1000 : 0));

    // 결과 출력 문자열 구성
    result = flag == true ? String.format("\n나이 : %d 세, 요금 : %,d 원\n", age, fee) : "\n나이 오류입니다\n";

    System.out.println(result);
}