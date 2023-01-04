package Lesson1_OOP;

public class SinhVien extends Nguoi {
    /*
     * Lớp con được thừa hưởng toàn bộ thuộc tính và p/thức
        của lớp cha
     * Lớp con chỉ được truy cập tới thuộc tính và p/thức
        KHÔNG PRIVATE của lớp cha.
     * Lớp con kế thừa kiểu dữ liệu của lớp cha
        => Đối tượng của lớp con được phép có kiểu
        của lớp cha.
     */

    /*
     * Override: Ghi đè
     * Xảy ra khi lớp con khai báo phương thức
     * cùng tên, cùng tham số với phương thức của lớp cha.
     */
    @Override
    public void xuatThongTin()
    {
        super.xuatThongTin();
        System.out.println("Hello Poly");
    }
    
    /*
     * Overload: Nạp chồng
     * Trong cùng 1 class có 2 p/thức cùng tên, khác tham số.
     * => Khi gọi hàm với những tham số khác nhau thì
        cho ra kết quả khác nhau
     */
    public void xuatThongTin(int diem)
    {
        System.out.println(diem);
    }
}
