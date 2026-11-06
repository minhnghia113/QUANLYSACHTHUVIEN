import java.util.Scanner;
import java.time.LocalDate;

public class Tuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n================ QUẢN LÝ SÁCH - TUẦN 5 ================");
            System.out.println("1. Nhập và kiểm tra thông tin sách (Hợp lệ/Không hợp lệ)");
            System.out.println("2. Phân loại giá sách & Tồn kho");
            System.out.println("3. Tính thành tiền và tổng chi phí nhập kho");
            System.out.println("4. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Xử lý trôi dòng

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sách: ");
                    String ma = scanner.nextLine();
                    System.out.print("Nhập đơn giá: ");
                    double gia = scanner.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int sl = scanner.nextInt();
                    System.out.print("Nhập năm xuất bản: ");
                    int namXB = scanner.nextInt();
                    
                    int namHienTai = LocalDate.now().getYear();
                    if (gia > 0 && sl >= 0 && namXB > 0 && namXB <= namHienTai) {
                        System.out.println("-> Kết quả: Dữ liệu sách HỢP LỆ!");
                    } else {
                        System.out.println("-> Kết quả: Dữ liệu sách KHÔNG HỢP LỆ!");
                    }
                    break;

                case 2:
                    System.out.print("Nhập đơn giá sách để phân loại: ");
                    double donGia = scanner.nextDouble();
                    if (donGia < 50000) {
                        System.out.println("-> Phân loại: Sách giá thấp");
                    } else if (donGia <= 100000) {
                        System.out.println("-> Phân loại: Sách giá trung bình");
                    } else if (donGia <= 200000) {
                        System.out.println("-> Phân loại: Sách giá cao");
                    } else {
                        System.out.println("-> Phân loại: Sách giá đặc biệt");
                    }
                    break;

                case 3:
                    System.out.print("Nhập đơn giá: ");
                    double dg = scanner.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int soluong = scanner.nextInt();
                    double thanhTien = dg * soluong;
                    double phiVC = thanhTien * 0.05;
                    double tongTien = thanhTien + phiVC;
                    System.out.println("-> Thành tiền: " + thanhTien);
                    System.out.println("-> Phí vận chuyển (5%): " + phiVC);
                    System.out.println("-> Tổng tiền nhập kho: " + tongTien);
                    break;

                case 4:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}