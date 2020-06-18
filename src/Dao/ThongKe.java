/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author quang
 */
public class ThongKe {

    private String MaTour;
    private String IDUSER;
    private String NgayKH;
    private String ThoiLuong;
    private String Gia;
    private String soNguoi;
    private String khuyenmai;

    @Override
    public String toString() {
        return "ThongKe{" + "MaTour=" + MaTour + ", IDUSER=" + IDUSER + ", NgayKH=" + NgayKH + ", ThoiLuong=" + ThoiLuong + ", Gia=" + Gia + ", soNguoi=" + soNguoi + ", khuyenmai=" + khuyenmai + '}';
    }

    public String getMaTour() {
        return MaTour;
    }

    public void setMaTour(String MaTour) {
        this.MaTour = MaTour;
    }

    public String getIDUSER() {
        return IDUSER;
    }

    public void setIDUSER(String IDUSER) {
        this.IDUSER = IDUSER;
    }

    public String getNgayKH() {
        return NgayKH;
    }

    public void setNgayKH(String NgayKH) {
        this.NgayKH = NgayKH;
    }

    public String getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(String ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public String getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(String soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getKhuyenmai() {
        return khuyenmai;
    }

    public void setKhuyenmai(String khuyenmai) {
        this.khuyenmai = khuyenmai;
    }

    public ThongKe(String MaTour, String IDUSER, String NgayKH, String ThoiLuong, String Gia, String soNguoi, String khuyenmai) {
        this.MaTour = MaTour;
        this.IDUSER = IDUSER;
        this.NgayKH = NgayKH;
        this.ThoiLuong = ThoiLuong;
        this.Gia = Gia;
        this.soNguoi = soNguoi;
        this.khuyenmai = khuyenmai;
    }

    public ThongKe() {
    }
}
