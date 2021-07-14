/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author dinht
 */
public class sanpham {
    private int MaSP;
    private String TenSP;
    private String NhaSanXuat;
    private int MaLoaiSP;

    public sanpham(int MaSP, String TenSP, String NhaSanXuat, int MaLoaiSP) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.NhaSanXuat = NhaSanXuat;
        this.MaLoaiSP = MaLoaiSP;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }

    public void setNhaSanXuat(String NhaSanXuat) {
        this.NhaSanXuat = NhaSanXuat;
    }

    public int getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(int MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }

    
}
