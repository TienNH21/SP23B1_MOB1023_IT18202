package Lesson1_OOP;

public class Nguoi {
    /*
     * Encapsulation: Tính đóng gói
     * private: Chỉ truy cập trong cùng class
     * default: Chỉ truy cập trong cùng package
     * protected: Truy cập trong cùng package hoặc class con.
     * public: Truy cập ở tất cả mọi class
     */
    private String hoTen;
    private int tuoi;

    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    /*
     * Constructor
     * Dùng để khởi tạo đối tượng.
     * Đặc điểm:
     * - Cùng tên với class
     * - KHÔNG có kiểu trả về
     */
    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void xuatThongTin()
    {
        System.out.println(this.hoTen + " | " + this.tuoi);
    }
}
