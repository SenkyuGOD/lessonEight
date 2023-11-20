import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        initArray(arr);

        showArray(arr);

        choseLineInArray(arr);
        choseColumnInArray(arr);
    }

    public static int[][] initArray(int[][] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rand.nextInt(10);
            }
        }
        return a;
    }

    public static void showArray(int[][] mas) {
        System.out.println("Исходная матрица-------------");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }

    }

    public static void choseLineInArray(int[][] mas) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Выберете какую строку вы хотите вывести: ");
        int line = sc.nextInt();

        for (int i = 0; i < mas[line - 1].length; i++) {
            System.out.printf("[%4d]", mas[line - 1][i]);
        }
    }

    public static void choseColumnInArray(int[][] mas) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Выберете какую колонку вы хотите вывести: ");
        int column = sc.nextInt();

        for (int i = 0; i < mas.length; i++) {
            System.out.printf("[%4d]\n", mas[i][column - 1]);
        }
    }
}
