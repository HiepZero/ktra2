

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lengu
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    static TreeSet ts= new TreeSet();
    //static TreeSet ts= new TreeSet();
    public static void fakeData(){
        HocVienDH hv0= new HocVienDH("ATen1","DC1","loai 1","DH",10,500000);
        HocVienDH hv1= new HocVienDH("BTen2","DC2","loai 1","DH",15,600000);
        HocVienDH hv2= new HocVienDH("CTen3","DC3","loai 2","DH",20,300000);
        ts.add(hv0);
        ts.add(hv1);
        ts.add(hv2); 
        Iterator bir= ts.iterator();
        while(bir.hasNext()){
            System.out.println(bir.next().toString());
        }
    }
    public static void nhapDSHV(){
        Scanner s= new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong hv:");
        n= s.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Nhap thong tin hoc vien thu "+(i+1)+":");
                HocVienDH hvdh[] = new HocVienDH[n];
                hvdh[i]= new HocVienDH();               
            try { 
                hvdh[i].nhapDL();            
            } 
            catch (Exception ex) {
                System.err.println(ex.getMessage());
                break;
            }
            ts.add(hvdh[i]);
        }
    }
    
    public static void xuatDL(){
        Iterator bir= ts.iterator();
        while(bir.hasNext()){
            System.out.println(bir.next().toString());
        }
    }
    public static void inTD(){
        System.out.println("HoTen\tDiaChi\tLoaiUuTien\tLoaiCT\tHocPhi");
    }
    public static void main(String[] args) {
        inTD();
        fakeData();
        nhapDSHV();
        System.out.println("DSHV:");
        inTD();     
        xuatDL();
    }
    
}
