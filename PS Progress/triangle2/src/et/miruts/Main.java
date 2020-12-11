package et.miruts;

public class Main {

    public static void main(String[] args) {
        printTriangle2(10);
    }

    public static void printTriangle2(int length) {
        for (int i = 0; i < length; i++) {
            int j = 2*i +1;
            int spaces = (2*length+1-j)/2;
            for (int k = 1; k <= spaces; k++){
                System.out.print(" ");
            }
            for( int l = 1; l <= j; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

