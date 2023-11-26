import java.util.*;

public class Task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = initNum(sc);
        int m = initNum(sc);

        int[][] arr = new int[n][m];

        initArray(arr);
        showArray(arr);

        findNegativeElementsInLine(arr);

        findMaxElementsInArray(arr);

        swapMinAndMaxElementsInMatrix(arr);
        showArray(arr);

    }

    public static int initNum(Scanner sc) {
        System.out.print("Введите положительную цифру: ");
        int n = sc.nextInt();
        return n;
    }

    public static void initArray(int[][] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt();
            }
        }
    }

    public static void showArray(int[][] mas) {
        System.out.println("Исходная матрица------------");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
    }

    public static void findNegativeElementsInLine(int[][] mas) {
        int n = 1;
        for (int i = 0; i < mas.length; i++) {
            long sum = 0;
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] < 0) {
                    sum += mas[i][j];
                }
            }
            System.out.println("Сумма отрцаиельных елементов в строке " + n + " равна: " + sum);
            n++;
        }
    }

    public static void findMaxElementsInArray(int[][] mas) {
        int line = 1;
        for (int i = 0; i < mas.length; i++) {
            int max = mas[i][0];
            for (int j = 0; j < mas[i].length; j++) {
                if (max < mas[i][j]) {
                    max = mas[i][j];
                }
            }
            System.out.println("Максимальное число в строке " + line + " равно: " + max);
            line++;
        }
    }

    public static void swapMinAndMaxElementsInMatrix(int[][] mas) {
        int line1 = 0;
        int column1 = 0;
        int max = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (max < mas[i][j]) {
                    max = mas[i][j];
                    line1 = i;
                    column1 = j;
                }
            }
        }

        int line2 = 0;
        int column2 =0;
        int min = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
           for (int j = 0; j < mas[i].length; j++) {
               if (min > mas[i][j]) {
                   min = mas[i][j];
                   line2 = i;
                   column2 = j;
               }
           }
        }

        int temp = mas[line1][column1];
        mas[line1][column1] = mas[line2][column2];
        mas[line2][column2] = temp;
    }
}
