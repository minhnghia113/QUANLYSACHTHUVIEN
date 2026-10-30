import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến
        String maSach, tenSach, tacGia;
        int namXuatBan, soLuong;
        double donGia, thanhTien, phiVanChuyen, tongTienNhap;

        // Nhập dữ liệu từ bàn phím
        System.out.print("Nhập mã sách: ");
        maSach = scanner.nextLine();

        System.out.print("Nhập tên sách: ");
        tenSach = scanner.nextLine();

        System.out.print("Nhập tác giả: ");
        tacGia = scanner.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        namXuatBan = scanner.nextInt();

        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();

        System.out.print("Nhập số lượng: ");
        soLuong = scanner.nextInt();

        // Tính toán theo yêu cầu
        thanhTien = donGia * soLuong;                    // Bài 2
        phiVanChuyen = 0.05 * thanhTien;                 // Bài 3
        tongTienNhap = thanhTien + phiVanChuyen;         // Bài 4

        // Hiển thị kết quả
        System.out.println("\n---------------- PHIẾU NHẬP SÁCH ----------------");
        System.out.println("Mã sách         : " + maSach);
        System.out.println("Tên sách        : " + tenSach);
        System.out.println("Tác giả         : " + tacGia);
        System.out.println("Năm xuất bản    : " + namXuatBan);
        System.out.println("Đơn giá         : " + donGia);
        System.out.println("Số lượng        : " + soLuong);
        System.out.println("------------------------------------------------");
        System.out.println("Thành tiền      : " + thanhTien);
        System.out.println("Phí vận chuyển  : " + phiVanChuyen);
        System.out.println("Tổng tiền nhập  : " + tongTienNhap);
        System.out.println("------------------------------------------------");

        scanner.close();
    }
}