package Lesson2_Lab1;

import java.util.ArrayList;

public interface IProductService {
    public void insert(Product p);
    public void update(int viTri, Product p);
    public void delete(int viTri);
    public ArrayList<Product> select();
}
