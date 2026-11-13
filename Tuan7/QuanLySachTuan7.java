package Tuan7;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySachTuan7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n================ QUẢN LÝ THƯ VIỆN SÁCH - TUẦN 7 ================");
            System.out.println("1. Thêm một cuốn sách mới (Tạo đối tượng)");
            System.out.println("2. Hiển thị danh sách các cuốn sách");
            System.out.println("3. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Xử lý trôi dòng

            switch (choice) {
                case 1:
                    System.out.println("\n--- NHẬP THÔNG TIN SÁCH MỚI ---");
                    System.out.print("Nhập mã sách: ");
                    String maSach = scanner.nextLine();
                    System.out.print("Nhập tiêu đề sách: ");
                    String tieuDe = scanner.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tacGia = scanner.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int namXuatBan = scanner.nextInt();
                    System.out.print("Nhập số lượng: ");
                    int soLuong = scanner.nextInt();
                    scanner.nextLine();

                    // Tạo đối tượng từ lớp Sach và thêm vào ArrayList
                    Sach sachMoi = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
                    danhSachSach.add(sachMoi);
                    System.out.println("-> Thêm sách vào danh sách thành công!");
                    break;

                case 2:
                    System.out.println("\n================ DANH SÁCH SÁCH TRONG THƯ VIỆN ================");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Thư viện hiện chưa có cuốn sách nào!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            danhSachSach.get(i).hienThiThongTin();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 3.");
            }
        } while (choice != 3);

        scanner.close();
    }
}