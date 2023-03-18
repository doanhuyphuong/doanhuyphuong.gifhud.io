package BaiThucHanh;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen duong bat ky: ");
        int n = sc.nextInt();
        int giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        System.out.println(n + "! = " + giaiThua);
    }
}
