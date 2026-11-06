                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      //TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
    // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
    IO.println(String.format("Hello and welcome!"));
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
    void main() {
        final int LINE = 5;
        final int STAR = 20;

        // ***************
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
        System.out.println();



        // ***************
        for (int i = 1; i <= LINE; i++)
            System.out.println("*********");
        System.out.println();



        // ***************
        for (int i = 1; i <= LINE; i++) {
            for (int j = 1; j <= STAR; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();



        // ***************
        int i = 1;
        while (i <= LINE) {
            int j = 1;
            while (j <= STAR) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();



        // ***************
        i = 1;
        do {
            int j = 1;
            do {
                System.out.print("*");
                j++;
            } while (j <= STAR);
            System.out.println();
            i++;
        } while (i <= LINE);

    }
    for (int i = 1; i <= 5; i++) {
        //TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
        // 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
        IO.println("i = " + i);
    }
}
