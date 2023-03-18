


public class SortAscending {
public static void main(String[] args) {

Sanner input = new Scanner(System

nt n = input.nextInt();
int[] A = new int[n];
System.out.println("Nhap cac gia tri cua mang A:");
for (int i = 0; i < n; i++) {
A[i] = input.nextInt();
}

Arrays.sort(A);


System.out.println("Mang so ban đầu la:");
for (int i = 0; i < n; i++) {
System.out.print(A[i] + " ");
}
System.out.println("Mang đã sap xep tang dan la:");
for (int i = 0; i < n; i++) {
System.out.print(A[i] + " ");
}
}
}