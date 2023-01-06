package Lesson2_Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService {
    private ArrayList<Product> listProd = new ArrayList<>();

    @Override
    public void insert(Product p) {
        this.listProd.add(p);
    }

    @Override
    public void update(int viTri, Product p) {
        this.listProd.set(viTri, p);
    }

    @Override
    public void delete(int viTri) {
        this.listProd.remove(viTri);
    }

    @Override
    public ArrayList<Product> select() {
        return this.listProd;
    }
    
}
