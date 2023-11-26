public class Task25 {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];

        initMatrix(arr);

        showMatrix(arr);
    }

    public static void showMatrix(int[][] mas) {
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
    }

    public static void initMatrix(int[][] mas) {
        int n = 1;
        for (int i = 0; i < mas[0].length; i++) {
            mas[0][i] = n;
            n++;
        }

        for (int i = 1; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = mas[i - 1][j] + mas.length;
            }
        }
    }
}
