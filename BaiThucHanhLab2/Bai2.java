package BaiThucHanh;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " So chan");
        } else {
            System.out.println(number + " So le");
        }
    }
}