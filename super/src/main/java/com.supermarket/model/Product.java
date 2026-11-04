public class Product {
    // data hiding product
    private String product_name;
    private String product_code;
    private String barcode;
    private double purchase_price;
    private double selling_price;
    private String Category;

    // constrco
    // getter function
    public String getBarcode() {
        return barcode;
    }

    public double getPurchase_price() {
        return purchase_price;
    }

    public String getCategory() {
        return Category;
    }

    public String getProduct_code() {
        return product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public double getSelling_price() {
        return selling_price;
    }

    // setter function
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setPurchase_price(double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public void setSelling_price(double selling_price) {
        this.selling_price = selling_price;
    }

}
