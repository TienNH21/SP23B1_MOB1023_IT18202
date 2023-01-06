package Lesson2_Interface;

public interface Animal {
    /*
     * Interface chỉ khai báo hàm, KHÔNG triển khai thân hàm.
     * Khi Class thực thi (implements) Interface, Class phải 
        triển khai tất cả các hàm được khai báo trong Interface.
     */
    public void an();
    public void diChuyen();
    public void keu();
}
