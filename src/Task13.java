public class Task13 {
    public static void main(String[] args) {
        int n = 8;
        int[][] arr = new int[n][n];

        initArrayByN(arr);

        showArray(arr);

    }

    public static int[][] initArrayByN(int[][] mas) {
        for (int i = 0; i < mas.length; i = i + 2) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = j + 1;
                mas[i + 1][j] = mas[i].length - j;
            }
        }
        return mas;
    }

    public static void showArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%3d ", mas[i][j]);
            }
            System.out.println();
        }
    }
}
