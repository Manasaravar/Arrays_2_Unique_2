import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(0);
        System.out.println("Введите строк: ");
        int rows = scanner.nextInt();
        System.out.println("Введите кол-во элементов строки: ");
        int cols = scanner.nextInt();

        int[] arr = new int[rows*cols];
        int[][] arr2 = new int[rows][cols];



        for (int i = 0; i < rows*cols; i++) {

            boolean unique;
            do {
                int randomDigital = random.nextInt(10);
                arr[i] = randomDigital;
                unique = true;
                for (int j = 0; j < i; j++) {

                    if (arr[i] == arr[j]) {
                        unique = false;
                        break;
                    }
                }
            } while (!unique);
        }
       // System.out.print(Arrays.toString(arr));
        int k = 0;
        while (k < rows*cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr2[i][j] = arr[k];
                    k++;
                }
            }
        }
        System.out.print(Arrays.deepToString(arr2));
    }
}