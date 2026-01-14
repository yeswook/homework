/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dell
 */
public class SanPham {

    public String MaSP;
    public String TenSP;
    public double donGia;
    public int soLuong;

    public SanPham() {
        this.MaSP = null;
        this.TenSP = null;
        this.donGia = 0;
        this.soLuong = 0;
    }

    public SanPham(String MaSP, String TenSP, double donGia, int soLuong) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public void Nhap()
    {
        
    }

}
