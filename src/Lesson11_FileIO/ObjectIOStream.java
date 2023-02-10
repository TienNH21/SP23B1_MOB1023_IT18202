package Lesson11_FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectIOStream {
    public static void main(String[] args) {
        String filename = "demo_object_io.txt";
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
    }
    
    public static void ghiFile(String filename) {
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại.");
            return ;
        }
        
        ArrayList<Integer> ds = new ArrayList<>();
        ds.add(1);
        ds.add(3);
        ds.add(2);
        
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ds);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void docFile(String filename) {
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại.");
            return ;
        }
        
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Integer> ds = (ArrayList<Integer>)ois.readObject();
            
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
