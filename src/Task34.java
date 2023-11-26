public class Task34 {
    public static void main(String[] args) {

        int[][] arr = new int[6][6];

        initMatrixByOne(arr);
        Task04.showArray(arr);
    }

    public static int[][] initMatrixByOne(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j ||  i > j) {
                    continue;
                }
                mas[i][j] = 1;
            }
        }
        return mas;
    }
}
