package et.miruts;

public class Main {

    public static void main(String[] args) {
        printTriangle1(10);
    }

    public static void printTriangle1(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }
}
