package Lesson8_Exception;

public class DemoException {
    public static void main(String[] args) {
        String[] list = { "20", "21", "Ng Van A", null, "22" };
        //                 0      1        2       3     4
        
        for (int i = 0; i < 10; i++) {
            try {
                String s = list[i];
                int j = strToInt(s);
                System.out.println(j);

                // INSERT INTO ...
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập số");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Quá phạm vi");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra");
                e.printStackTrace();
            } finally {
                System.out.println("Đóng file/kết nối ...");
            }
        }
        
        System.out.println("Kết thúc");
    }
    
    // "-1"
    public static int strToInt(String s) throws Exception
    {
        try {
            int i = Integer.parseInt(s);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
