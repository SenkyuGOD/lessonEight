public class Task16 {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];

        initArray(arr);

        showArray(arr);
    }

    public static void initArray(int[][] mas) {
        int n = 1;
        for (int i = 0; i < mas.length; i++) {
            mas[i][i] = n * (n + 1);
            n++;
        }
    }

    public static void showArray(int[][] mas) {
        System.out.println("Ваш массив----------");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]",mas[i][j]);
            }
            System.out.println();
        }
    }
}

