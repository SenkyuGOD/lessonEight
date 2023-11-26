import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = initNum(scanner);
        int[][] arr = new int[n][n];

        initMatrix(arr, n);

        showMatrix(arr);
    }

    public static int initNum(Scanner scanner) {
        System.out.print("Введите число для создание магической матрицы: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Для чётного порядка квадрата магический квадрат не может быть построен.");
            return -1;
        }
        return n;
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

    public static void initMatrix(int[][] mas, int n) {
        int num = 1;
        int i = n / 2;
        int j = n - 1;

        while (num <= n * n) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n)
                    j = 0;
                if (i < 0)
                    i = n - 1;
            }

            if (mas[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                mas[i][j] = num++;
            }

            j++;
            i--;
        }
    }
}
