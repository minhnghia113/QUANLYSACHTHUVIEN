import java.util.Scanner;

public class Tuan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sách cần quản lý (N): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Khai báo mảng lưu trữ thông tin
        String[] maSach = new String[n];
        String[] tenSach = new String[n];
        double[] donGia = new double[n];
        int[] soLuong = new int[n];

        // Nhập thông tin cho từng cuốn sách
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập thông tin cuốn sách thứ " + (i + 1) + " ---");
            System.out.print("Mã sách: ");
            maSach[i] = scanner.nextLine();
            System.out.print("Tên sách: ");
            tenSach[i] = scanner.nextLine();
            System.out.print("Đơn giá: ");
            donGia[i] = scanner.nextDouble();
            System.out.print("Số lượng: ");
            soLuong[i] = scanner.nextInt();
            scanner.nextLine(); // Xử lý trôi dòng
        }

        // Hiển thị danh sách và tính toán tổng tiền
        System.out.println("\n================ DANH SÁCH THƯ VIỆN SÁCH ================");
        System.out.printf("%-10s | %-20s | %-10s | %-10s | %-15s\n", "Mã Sách", "Tên Sách", "Đơn Giá", "Số Lượng", "Thành Tiền");
        System.out.println("-------------------------------------------------------------------------");

        double tongChiPhiKho = 0;
        for (int i = 0; i < n; i++) {
            double thanhTien = donGia[i] * soLuong[i];
            double tongTienNhap = thanhTien + (thanhTien * 0.05); // Đã cộng 5% phí vận chuyển
            tongChiPhiKho += tongTienNhap;

            System.out.printf("%-10s | %-20s | %-10.1f | %-10d | %-15.1f\n", 
                maSach[i], tenSach[i], donGia[i], soLuong[i], tongTienNhap);
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Tổng chi phí nhập toàn bộ kho sách: " + tongChiPhiKho);

        scanner.close();
    }
}