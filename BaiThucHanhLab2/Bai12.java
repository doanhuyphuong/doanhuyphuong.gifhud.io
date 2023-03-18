package BaiThucHanh;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran: ");
        int rows = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran la: " + max);
    }
}
