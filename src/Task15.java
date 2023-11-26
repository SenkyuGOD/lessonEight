public class Task15 {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];

        getASquareMatrixOfOrderN(arr,n);

        showArray(arr);
    }

    public static int[][] getASquareMatrixOfOrderN(int[][] mas, int num) {
        for (int i = 0; i < mas.length; i++) {
            mas[i][i] = num;
            num--;
        }
        return mas;
    }

    public static void showArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
    }

}
