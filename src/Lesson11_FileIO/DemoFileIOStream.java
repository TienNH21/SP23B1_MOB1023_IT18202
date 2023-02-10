package Lesson11_FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoFileIOStream {
    public static void main(String[] args) {
        String filename = "demo_file_io.txt";
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
    }
    
    public static void ghiFile(String filename)
    {
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại.");
            return ;
        }
        
        try {
            FileOutputStream fos = new FileOutputStream(f);
            
            String s = "Hello Poly";
            byte[] b = s.getBytes();
            fos.write(b);
            
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public static void docFile(String filename)
    {
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại.");
            return ;
        }
        
        try {
            FileInputStream fis = new FileInputStream(f);
            while (true) {
                int i = fis.read();
                if (i == -1) {
                    break;
                }

                System.out.print((char)i);
            }

            System.out.println("");
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
