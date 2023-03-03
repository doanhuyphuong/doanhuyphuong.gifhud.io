import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so;
        System.out.println("Nhap vao mot so tuong ung trong tuan le:");
        so = sc.nextInt();
        switch (so) {
            case 1:
                System.out.println("Ngay Chu Nhat");
                break;
            case 2:
                System.out.println("Ngay Thu Hai");
                break;
            case 3:
                System.out.println("Ngay Thu Ba");
                break;
            case 4:
                System.out.println("Ngay Thu Tu");
                break;
            case 5:
                System.out.println("Ngay Thu Nam");
                break;
            case 6:
                System.out.println("Ngay Thu Sau");
                break;
            case 7:
                System.out.println("Ngay Thu Bay");
                break;
            default:
                System.out.println("So Nhap Vao Khong Hop Le!");
                break;
        }

    }
}