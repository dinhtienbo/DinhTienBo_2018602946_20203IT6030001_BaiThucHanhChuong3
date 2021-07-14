/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Thang
 */
public class Sach {
    private String maSach;
    private String tuSach;
    private int soTrang;
    private String maTacGia;
    private int namXB;
    private String tuKhoa;
    private String NXB;

    public Sach() {
    }
    public Sach(String maSach, String tuSach, int soTrang, String maTacGia, int namXB, String tuKhoa, String NXB) {
        this.maSach = maSach;
        this.tuSach = tuSach;
        this.soTrang = soTrang;
        this.maTacGia = maTacGia;
        this.namXB = namXB;
        this.tuKhoa = tuKhoa;
        this.NXB = NXB;
    }
    
    
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTuSach() {
        return tuSach;
    }

    public void setTuSach(String tuSach) {
        this.tuSach = tuSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }
    
}
