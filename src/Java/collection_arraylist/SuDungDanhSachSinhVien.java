package Java.collection_arraylist;

import java.util.Scanner;

public class SuDungDanhSachSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luachon = 0;
        do{
            System.out.println("Menu -------------");
            System.out.println("Vui lòng chọn tính năng mà bạn muốn chúng tôi thực hiện:");
            System.out.println(
                    "1. Thêm sinh viên vào danh sách.\n"
                    + "2. In danh sách sinh viên ra màn hình.\n"
                    + "3. Kiểm tra danh sách có rỗng hay không.\n"
                    + "4. Lấy ra số lượng sinh viên trong danh sách.\n"
                    + "5. Làm rỗng danh sách sinh viên.\n"
                    + "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trêm mã sinh viên.\n"
                    + "0. Thoát khỏi chương trình");
            luachon = sc.nextInt();
            sc.nextLine();
            switch (luachon){
                case 1:{
                    System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
                    System.out.println("Nhập họ tên sinh viên: "); String hoTenSinhVien = sc.nextLine();
                    System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
                    System.out.println("Nhập điểm trung bình: "); float diem = sc.nextFloat();
                    SinhVien sv = new SinhVien(maSinhVien,hoTenSinhVien,namSinh,diem);
                    dssv.themSinhVien(sv);
                    break;
                }
                case 2:{
                    dssv.inDanhSachSinhVien();
                    break;
                }
                case 3:{
                    if(dssv.kiemTraDanhSachRong())
                        System.out.println("Danh sách rỗng");
                    else System.out.println("Danh sách có sinh viên");
                    break;
                }
                case 4:{
                    System.out.println("Số lượng sinh viên: "+ dssv.laySoLuongSinhVien());
                    break;
                }
                case 5:{
                    dssv.lamRongDanhSachSinhVien();
                    break;
                }
                case 6:{
                    System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
                    SinhVien sv = new SinhVien(maSinhVien);
                    System.out.println("sinh viên có tồn tại trong danh sách hay không: "+ dssv.kiemTraTonTai(sv));
                }
            }
        }while(luachon != 0);
    }
}
