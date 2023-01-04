package sp23b1_mob1023_it18202;

import Lesson1_OOP.SinhVien;
import Lesson1_OOP.Nguoi;


public class SP23B1_MOB1023_IT18202 {

    public static void main(String[] args) {
        // Khai báo biến sv có kiểu Nguoi
        SinhVien sv;
        
        // Khởi tạo đối tượng có kiểu SinhVien, gán vào sv
        sv = new SinhVien();
        sv.setHoTen("ABC");
        sv.xuatThongTin();
    }
    
}
