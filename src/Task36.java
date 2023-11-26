public class Task36 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        Task04.initArray(arr);
        Task04.showArray(arr);

        smoothMatrix(arr);
        Task04.showArray(arr);
    }

    public static int[][] smoothMatrix(int[][] mas) {
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {




                int sum = 0;
                int count = 0;

                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k >= 0 && k < mas.length && l >= 0 && l < mas[i].length) {
                            sum += mas[k][l];
                            count++;
                        }
                    }
                }
                int average = sum / count;
                mas[i][j] = average;
            }
        }
        return mas;
    }
}
