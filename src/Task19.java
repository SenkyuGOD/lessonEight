public class Task19 {
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
        int start = 0;
        int end = mas.length - 1;
        int count = 0;

        for (int i = 0; i < mas.length / 2; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j >= start && j <= end) {
                    mas[i][j] = 1;
                }
            }
            start++;
            end--;
            count++;
        }

        start = mas[count].length / 2 - 1;
        end = mas[count].length / 2 ;

        for (int i = count; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j >= start && j <= end) {
                    mas[i][j] = 1;
                }
            }
            start--;
            end++;
        }
    }
}
