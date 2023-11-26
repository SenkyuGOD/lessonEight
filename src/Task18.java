public class Task18 {
    public static void main(String[] args) {
        int n  = 6;
        int[][] arr = new int[n][n];

        initArray(arr);

        showArray(arr);
    }

    public static void initArray(int[][] mas) {
        int n = 1;
        int k = mas[0].length;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < k; j++) {
                mas[i][j] = n;
            }
            k--;
            n++;
        }
    }

    public static void showArray(int[][] mas) {
        for (int i =0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%2d]",mas[i][j]);
            }
            System.out.println();
        }
    }
}
