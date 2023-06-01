
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lengu
 */
abstract class HocVien {
    private String hoTen;
    private String diaChi;
    String loaiUT;
    private String loaiCT;

    public HocVien(){}
    
    public HocVien(String hoTen, String diaChi, String loaiUT, String loaiCT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiUT = loaiUT;
        this.loaiCT = loaiCT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getLoaiUT() {
        return loaiUT;
    }

    public String getLoaiCT() {
        return loaiCT;
    }

    public void setHoTen(String hoTen) throws Exception {
        if(hoTen.equals("")){
            throw new Exception("Dung chuong trinh");
        }
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiUT(String loaiUT) {
        this.loaiUT = loaiUT;
    }

    public void setLoaiCT(String loaiCT) {
        this.loaiCT = loaiCT;
    }
    
    abstract double tinhHP();
    public void nhapTT() throws Exception{
        Scanner s= new Scanner(System.in);
        System.out.print("Nhap ho ten:");
        setHoTen(s.nextLine());
        System.out.print("Nhap dia chi:");
        setDiaChi(s.nextLine());
        System.out.print("Nhap loai uu tien:");
        setLoaiUT(s.nextLine());
        System.out.print("Nhap chuong trinh hoc:");
        setLoaiCT(s.nextLine());
    }
    public String inTT(){
        return hoTen+"\t"+diaChi+"\t"+loaiUT+"\t\t"+loaiCT+"\t"+tinhHP();
    }
}
