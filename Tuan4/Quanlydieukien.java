import java.util.Scanner;
import java.time.LocalDate;

public class QuanLySachDieuKien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến thông tin sách
        String maSach, tenSach, tacGia;
        int namXuatBan, soLuong, loaiSachchon;
        double donGia;

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

        System.out.println("\n---------------- KẾT QUẢ XỬ LÝ ----------------");

        // --- BÀI 1: Kiểm tra tính hợp lệ của dữ liệu ---
        int currentYear = LocalDate.now().getYear();
        boolean isValid = (donGia > 0) && (soLuong >= 0) && (namXuatBan > 0 && namXuatBan <= currentYear);[span_6](start_span)[span_6](end_span)
        
        if (isValid) {
            System.out.println("Bài 1: Dữ liệu sách hợp lệ (Giá > 0, Số lượng >= 0, Năm xuất bản hợp lệ).");[span_7](start_span)[span_7](end_span)
        } else {
            System.out.println("Bài 1: Dữ liệu sách KHÔNG hợp lệ! Vui lòng kiểm tra lại giá, số lượng hoặc năm xuất bản.");[span_8](start_span)[span_8](end_span)
        }

        // --- BÀI 2: Phân loại giá ---
        // Giá < 50.000 -> Sách giá thấp[span_9](start_span)[span_9](end_span)
        // 50.000 - 100.000 -> Sách giá trung bình[span_10](start_span)[span_10](end_span)
        // 100.000 - 200.000 -> Sách giá cao[span_11](start_span)[span_11](end_span)
        // > 200.000 -> Sách giá đặc biệt[span_12](start_span)[span_12](end_span)
        System.out.print("Bài 2: Phân loại giá -> ");
        if (donGia < 50000) {[span_13](start_span)[span_13](end_span)
            System.out.println("Sách giá thấp");[span_14](start_span)[span_14](end_span)
        } else if (donGia >= 50000 && donGia <= 100000) {[span_15](start_span)[span_15](end_span)
            System.out.println("Sách giá trung bình");[span_16](start_span)[span_16](end_span)
        } else if (donGia > 100000 && donGia <= 200000) {[span_17](start_span)[span_17](end_span)
            System.out.println("Sách giá cao");[span_18](start_span)[span_18](end_span)
        } else {
            System.out.println("Sách giá đặc biệt");[span_19](start_span)[span_19](end_span)
        }

        // --- BÀI 3: Phân loại tồn kho ---
        // 0 -> Hết sách[span_20](start_span)[span_20](end_span)
        // 1 - 5 -> Sắp hết[span_21](start_span)[span_21](end_span)
        // 6 - 20 -> Còn ít[span_22](start_span)[span_22](end_span)
        // > 20 -> Còn nhiều[span_23](start_span)[span_23](end_span)
        System.out.print("Bài 3: Phân loại tồn kho -> ");
        if (soLuong == 0) {[span_24](start_span)[span_24](end_span)
            System.out.println("Hết sách");[span_25](start_span)[span_25](end_span)
        } else if (soLuong >= 1 && soLuong <= 5) {[span_26](start_span)[span_26](end_span)
            System.out.println("Sắp hết");[span_27](start_span)[span_27](end_span)
        } else if (soLuong >= 6 && soLuong <= 20) {[span_28](start_span)[span_28](end_span)
            System.out.println("Còn ít");[span_29](start_span)[span_29](end_span)
        } else {
            System.out.println("Còn nhiều");[span_30](start_span)[span_30](end_span)
        }

        // --- BÀI 4: Dùng switch chọn loại sách ---
        System.out.println("\nChọn loại sách:");
        System.out.println("1. Sách giáo khoa");[span_31](start_span)[span_31](end_span)
        System.out.println("2. Sách tham khảo");[span_32](start_span)[span_32](end_span)
        System.out.println("3. Sách chuyên ngành");[span_33](start_span)[span_33](end_span)
        System.out.println("4. Sách khác");[span_34](start_span)[span_34](end_span)
        System.out.print("Nhập lựa chọn của bạn (1-4): ");
        loaiSachchon = scanner.nextInt();

        System.out.print("Bài 4: Loại sách được chọn -> ");
        switch (loaiSachchon) {
            case 1:
                System.out.println("Sách giáo khoa");[span_35](start_span)[span_35](end_span)
                break;
            case 2:
                System.out.println("Sách tham khảo");[span_36](start_span)[span_36](end_span)
                break;
            case 3:
                System.out.println("Sách chuyên ngành");[span_37](start_span)[span_37](end_span)
                break;
            case 4:
                System.out.println("Sách khác");[span_38](start_span)[span_38](end_span)
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }

        System.out.println("------------------------------------------------");
        scanner.close();
    }
}