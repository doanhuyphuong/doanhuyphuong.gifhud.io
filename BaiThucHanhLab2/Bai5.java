package BaiThucHanh;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.print("Nhap so: ");
            num = scanner.nextInt();
            sum += num;
        } while (sum <= 100);

        System.out.println("Tong cac so da nhap: " + sum);
    }
}
