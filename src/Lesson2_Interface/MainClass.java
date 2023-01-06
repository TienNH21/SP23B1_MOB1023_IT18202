package Lesson2_Interface;

public class MainClass {
    public static void main(String[] args) {
//        Animal c; // Khai báo biến c có kiểu Cat
//        c = new Cat(); // Khởi tạo đối tượng Cat và gán vào biến c
//        c.an();
//        c.keu();
//        c.diChuyen();

        Animal c = new Cat();
        Animal d = new Dog();
        Animal b = new Bird();
        MainClass.nuoi(c);
        MainClass.nuoi(d);
        MainClass.nuoi(b);
    }
    
    public static void nuoi(Animal c)
    {
        c.an();
        c.diChuyen();
        c.keu();
    }
}
