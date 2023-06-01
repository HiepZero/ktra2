package QLBV;

import java.util.Comparator;

public class BenhNhan {
    private String tienSu;
    private String chuanDoan;
    BenhVien bv = new BenhVien();

    public BenhNhan(){}

    public BenhNhan(String tenBv, String gd, String dc, String tienSu, String chuanDoan){
        bv.setTenBV(tenBv);
        bv.setDiaChi(dc);
        bv.setGiamDoc(gd);
        this.tienSu=tienSu;
        this.chuanDoan=chuanDoan;
    }
    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public String getTienSu() {
        return tienSu;
    }

    public String getChuanDoan() {
        return chuanDoan;
    }

    public void setChuanDoan(String chuanDoan) throws  Exception {
        if(chuanDoan.equals("")){
            throw new Exception("Chuan doan phai khac rong");
        }
        this.chuanDoan = chuanDoan;
    }

    @Override
    public String toString() {
       return bv.toString()+ "\t" +tienSu + "\t" + chuanDoan;
    }


}
