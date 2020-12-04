package app;


public class Staircase {

    private static void print(char c){
        System.out.print(c);
    }

    private static char symbol(int row, int col, int n) {
        return col < n - row - 1 ? ' ' : '#';
    }

    private static void staircase(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(col < n - row - 1){
                    System.out.print(" ");
                } else System.out.print("#");
            }
            System.out.println();
        }
    }

    private static void staircase1(int n) {
        for (int i = 0; i < n * n; i++) {
            int row = i / n;
            int col = i % n;
            print(symbol(row, col, n));
            if (col == n - 1) print('\n');
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }
}
