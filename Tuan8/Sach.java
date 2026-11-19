package Tuan8;

import java.time.LocalDate;

public class Sach {
    // Yêu cầu 1: Các thuộc tính khai báo private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor mặc định
    public Sach() {
    }

    // Yêu cầu 4: Constructor có tham số đầy đủ
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    // Yêu cầu 2: Public Getters và Setters
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    // Yêu cầu 3: Kiểm tra năm xuất bản hợp lệ
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = LocalDate.now().getYear();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("-> Năm xuất bản không hợp lệ (phải > 0 và <= " + currentYear + "). Đặt mặc định là 0.");
            this.namXuatBan = 0;
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    // Yêu cầu 3: Đảm bảo số lượng không âm
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("-> Số lượng không được âm (phải >= 0). Đặt mặc định là 0.");
            this.soLuong = 0;
        }
    }

    public void hienThiThongTin() {
        System.out.printf("Mã: %-8s | Tiêu đề: %-18s | Tác giả: %-15s | Năm XB: %-5d | Số lượng: %-5d%n",
                maSach, tieuDe, tacGia, namXuatBan, soLuong);
    }
}