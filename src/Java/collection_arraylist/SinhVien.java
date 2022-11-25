package Java.collection_arraylist;

public class SinhVien {
    private String maSinhVien, hoTenSinhVien;
    private int namSinh;
    private float diemTrungBinh;

    public SinhVien(String maSinhVien, String hoTenSinhVien, int namSinh, float diemTrungBinh){
        this.maSinhVien = maSinhVien;
        this.hoTenSinhVien = hoTenSinhVien;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public SinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }
    public String getMaSinhVien(){
        return maSinhVien;
    }

    public int getNamSinh(){
        return namSinh;
    }

    public String getHoTenSinhVien(){
        return hoTenSinhVien;
    }

    public float getDiemTrungBinh(){
        return diemTrungBinh;
    }

    public void setMaSinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }

    public void setHoTenSinhVien(String hoTenSinhVien){
        this.hoTenSinhVien = hoTenSinhVien;
    }

    public void setDiemTrungBinh(float diemTrungBinh){
        this.diemTrungBinh = diemTrungBinh;
    }

    public String toString(){
        return(" Mã sinh viên: "+maSinhVien +", Họ tên: "+hoTenSinhVien+", Năm sinh: "+namSinh+", Điểm:"+diemTrungBinh);
    }

    public int compareTo(String maSinhVien1){
        return maSinhVien.compareTo(maSinhVien1);
    }
}
