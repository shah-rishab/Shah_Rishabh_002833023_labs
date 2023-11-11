/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author risha
 */
public class OrderItem {

    Product product;
    double SalesPrice;
    int quantity;


    public OrderItem(Product product, double SalesPrice, int quantity) {
        this.product = product;
        this.SalesPrice = SalesPrice;
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getSalesPrice() {
        return SalesPrice;
    }

    public void setSalesPrice(double SalesPrice) {
        this.SalesPrice = SalesPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return this.product.toString();
    
    }
    
    
}
