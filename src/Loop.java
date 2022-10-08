public class Loop {
    static void WhilePrint() {
        int i = 10;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
    }

    static void DoWhilePrint() {
        int i = 5;
        do {
            System.out.print(i + " ");
            i--;
        }
        while (i >= -1);
        System.out.println();
    }

    static void ForPrint() {
        for (int i = 0; i < 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
