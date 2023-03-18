
package BaiThucHanh;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua day so: ");
        int n = scanner.nextInt();

        int sum = 0;

        System.out.print("Nhap day so: ");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / n;

        System.out.println("Trung binh cong cua day so la: " + average);
    }
}