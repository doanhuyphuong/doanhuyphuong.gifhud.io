package BaiThucHanh;

import java.util.Scanner;

public class Bai9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = scanner.nextLine();

        int countLower = 0, countUpper = 0, countNumber = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                countLower++;
            } else if (c >= 'A' && c <= 'Z') {
                countUpper++;
            } else if (c >= '0' && c <= '9') {
                countNumber++;
            }
        }

        System.out.println("So ky tu thuong: " + countLower);
        System.out.println("So ky tu hoa: " + countUpper);
        System.out.println("So so: " + countNumber);

        scanner.close();
    }
}
