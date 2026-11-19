package Tuan8;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySachTuan8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n================ QUẢN LÝ THƯ VIỆN SÁCH - TUẦN 8 ================");
            System.out.println("1. Thêm sách mới (có kiểm tra năm XB & số lượng)");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Cập nhật số lượng sách theo mã sách");
            System.out.println("4. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- NHẬP THÔNG TIN SÁCH ---");
                    System.out.print("Nhập mã sách: ");
                    String maSach = scanner.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String tieuDe = scanner.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tacGia = scanner.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int namXuatBan = scanner.nextInt();
                    System.out.print("Nhập số lượng: ");
                    int soLuong = scanner.nextInt();
                    scanner.nextLine();

                    Sach sachMoi = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);
                    danhSachSach.add(sachMoi);
                    System.out.println("-> Đã thêm sách vào danh sách!");
                    break;

                case 2:
                    System.out.println("\n================ DANH SÁCH SÁCH ================");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sách trống!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            danhSachSach.get(i).hienThiThongTin();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhập mã sách cần cập nhật số lượng: ");
                    String maCanTim = scanner.nextLine();
                    boolean timThay = false;
                    for (Sach s : danhSachSach) {
                        if (s.getMaSach().equalsIgnoreCase(maCanTim)) {
                            System.out.print("Nhập số lượng mới: ");
                            int slMoi = scanner.nextInt();
                            scanner.nextLine();
                            s.setSoLuong(slMoi);
                            System.out.println("-> Đã cập nhật số lượng!");
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) {
                        System.out.println("-> Không tìm thấy sách có mã: " + maCanTim);
                    }
                    break;

                case 4:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 4);

        scanner.close();
    }
}
