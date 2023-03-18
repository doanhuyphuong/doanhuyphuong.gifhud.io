package BaiThucHanh;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = input.nextLine();
        System.out.print("Nhap ky tu: ");
        char ch = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu " + ch + " trong chuoi la " + count);
    }
}
