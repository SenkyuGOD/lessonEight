import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = writeNum(sc);

        double[][] arr = initArray(n);

        showArray(arr);

        howMuchPositiveElementsInArray(arr);
    }

    public static int writeNum(Scanner sc) {
        System.out.print("Введите число которое создаст матрицу по определенным параметрам: ");
        int n = sc.nextInt();
        return n;
    }

    public static double[][] initArray(int n) {
        double[][] mas = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
            }
        }
        return mas;
    }

    public static void showArray(double[][] mas) {
        System.out.println("Ваша матрица-----------------");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4f]", mas[i][j]);
            }
            System.out.println();
        }
    }

    public static void howMuchPositiveElementsInArray(double[][] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > 0) {
                    count++;
                }
            }
        }
        System.out.println("Количество положительных элементов в данной матрице: " + count);
    }
}
