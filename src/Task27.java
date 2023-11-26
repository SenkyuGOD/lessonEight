import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 6;
        int[][] arr = new int[n][n];

        Task04.initArray(arr);
        showArray(arr);

        int column1 = chooseColumn(scanner);
        int column2 = chooseColumn(scanner);

        swapColumns(arr, column1, column2);
        showArray(arr);

    }


    public static void showArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
    }

    public static int chooseColumn(Scanner scanner) {
        System.out.print("Выберете столбик в матрице: ");
        int n = scanner.nextInt();
        if (n > 0) {
            n -= 1;
        } else {
            n = 0;
        }
        return n;
    }

    public static void swapColumns(int[][] mas, int column1, int column2) {
        for (int i = 0; i < mas.length; i++) {
            int temp = mas[i][column1];
            mas[i][column1] = mas[i][column2];
            mas[i][column2] = temp;
        }
        System.out.println("Ваша измененная матрица---------");
    }
}
