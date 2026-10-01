public class Main {
    public static void main(String[] args) {
        String Name = "홍길동";    // 주문자
        double Moni = 60.96;     // 모니터 크기 (cm)
        double Clk = 2.8;        // CPU 클럭 (GHz)
        int Hdd = 500;           // 하드디스크 (GB)
        String Etc = "방문설치";   // 기타 옵션

        // 변수 값 확인 출력
        System.out.println("주문자: " + Name);
        System.out.println("모니터: " + Moni + "cm");
        System.out.println("CPU: " + Clk + "GHz");
        System.out.println("하드디스크: " + Hdd + "GB");
        System.out.println("기타: " + Etc);
    }
}