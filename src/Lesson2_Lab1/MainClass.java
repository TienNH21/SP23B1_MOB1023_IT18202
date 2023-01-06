/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson2_Lab1;

import java.util.Scanner;

/**
 *
 * @author tiennh
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten SP:");
        String name = sc.nextLine();
        System.out.println("Nhap gia SP:");
        double price = Double.parseDouble( sc.nextLine() );
        Product p = new Product(name, price);
    }
}
