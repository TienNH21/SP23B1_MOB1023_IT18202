package Lesson2_Interface;

public interface Animal {
    /*
     * Interface chỉ khai báo hàm, KHÔNG triển khai thân hàm.
     * Khi Class thực thi (implements) Interface, Class phải 
        triển khai tất cả các hàm được khai báo trong Interface.
     * Khi Class implements Interface, đối tượng của Class
        cũng có kiểu của Interface
    => Interface là cách gián tiếp để hỗ trợ đa kế thừa
     */
    public void an();
    public void diChuyen();
    public void keu();
}
