package Java.collection_arraylist;

import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(){
        danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach){
        this.danhSach = danhSach;
    }
    //thêm sinh viên vào danh sách
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    //In sinh viên ra màn hình
    public void inDanhSachSinhVien(){
        for (SinhVien sv: danhSach) {
            System.out.println(sv.toString());
        }
    }
    // Kiểm tra danh sách có rỗng hay không
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }
    //Lay ra so luong sinh vien trong danh sach
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }

    public void lamRongDanhSachSinhVien(){
        this.danhSach.removeAll(danhSach);
    }

    public boolean kiemTraTonTai(SinhVien sv){
       for (SinhVien sinhvien : danhSach){
           int kiemTraSinhVien = sinhvien.compareTo(sv.getMaSinhVien());
           if(kiemTraSinhVien == 0)
               return  true;
       }
        return false;
    }
}
