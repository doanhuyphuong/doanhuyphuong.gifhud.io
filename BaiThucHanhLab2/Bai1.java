package BaiThucHanh;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so dau tien: ");
        int num1 = sc.nextInt();
        System.out.print("Nhap so thu 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        int quo = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + diff);
        System.out.println("Tich: " + prod);
        System.out.println("Thuong: " + quo);
        System.out.println("Du: " + mod);
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
        sc.close();
    }
}