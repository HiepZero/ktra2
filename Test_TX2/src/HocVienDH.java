
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lengu
 */
public class HocVienDH extends HocVien implements Comparable<HocVienDH>{
    private int soBuoi;
    private double donGia;
    private double uuTien;
    public HocVienDH(){}

    public HocVienDH(String hoTen, String diaChi, String loaiUT, String loaiCT,int soBuoi, double donGia) {
        super(hoTen, diaChi, loaiUT, loaiCT);
        this.soBuoi = soBuoi;
        this.donGia = donGia;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setSoBuoi(int soBuoi)throws Exception{
        if(soBuoi<=0){
            throw new Exception("So buoi ko hop le ");
        }
        this.soBuoi = soBuoi;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getUuTien(){
        if("loai 1".equals(loaiUT)){
            uuTien=1000000;
        }
        if("loai 2".equals(loaiUT)){
            uuTien=500000;
        }
        return uuTien;
    } 
    @Override
    public double tinhHP() {
        return soBuoi*donGia-getUuTien(); 
    }
    public void nhapDL()throws Exception{
        Scanner s= new Scanner(System.in);
        super.nhapTT();
        System.out.print("Nhap so buoi:");
        setSoBuoi(s.nextInt());
        System.out.print("Nhap don gia:");
        setDonGia(s.nextDouble());
    }

    @Override
     public int compareTo(HocVienDH o) {
        if(this.soBuoi > o.soBuoi){
            return  1;
        }else if(this.soBuoi < o.soBuoi){
            return -1;
        }else {
            return 0;
        }
    }
    @Override
    public String toString(){
        return super.inTT();
    }
}
