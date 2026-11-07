package com.supermarket.model;

public class Product {
    // data hiding product
    private String product_name;
    // private String product_code;
    private String barcode;
    private double purchase_price;
    private double selling_price;
    private String Category;

    // constrctor
    public Product() {

    }

    // getter function
    public String getproduct_name() {
        return product_name;
    }

    public String getbarcode() {
        return barcode;
    }

    public double getpurchase_price() {
        return purchase_price;
    }

    public double getselling_price() {
        return selling_price;
    }

    public String getCategory() {
        return Category;
    }

    // setter function
    public void setproduct_name(String pn) {
        if (pn != null && !pn.isBlank()) {
            this.product_name = pn;
        }

    }

    public void setbarcode(String bc) {
        if (bc != null && !bc.isBlank()) {
            this.barcode = bc;
        }
    }

    public void setpurchase_price(double pp) {
        if (pp > 0 && selling_price >= purchase_price) {
            this.purchase_price = pp;
        } else {
            System.err.println(" As price < 0 and = 0");
        }
    }

    public void setselling_price(double sp) {
        if (sp > 0 && selling_price >= purchase_price) {
            this.selling_price = sp;
        } else {
            System.err.println(" As price < 0 and = 0");
        }
    }

    public void setCategory(String c) {
        if (c != null && !c.isBlank()) {
            this.Category = c;
        }
    }
}
