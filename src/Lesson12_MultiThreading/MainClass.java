package Lesson12_MultiThreading;

public class MainClass {
    public static void main(String[] args) {
        // Kê bàn, Lau bảng
        //  Lộc     Hiếu
        MyRunnable cv1 = new MyRunnable("Kê bàn"),
            cv2 = new MyRunnable("Lau bảng");
        Thread loc = new Thread(cv1),
            hieu = new Thread(cv2);
        
        loc.start();
        hieu.start();
    }
}
