/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HuongHoang
 */
public class Products {
    private int product_id;
    private String product_name;
    private int brand_id;
    private int category_id;
    private float product_price;
    private float import_price;
    private int product_quantity;
    private String product_image;
    private Categories category;
    private Brands brand;
    private ProductDetail productdetail;

    public float getImport_price() {
        return import_price;
    }

    public void setImport_price(float import_price) {
        this.import_price = import_price;
    }

    public ProductDetail getProductdetail() {
        return productdetail;
    }

    public void setProductdetail(ProductDetail productdetail) {
        this.productdetail = productdetail;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public Products( int product_quantity) {
        this.product_quantity = product_quantity;
    }


    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public Products() {
    }

    public Products(int product_id, String product_name, int brand_id, int category_id, float product_price, String product_image,int product_quantity,float import_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.brand_id = brand_id;
        this.category_id = category_id;
        this.product_price = product_price;
        this.product_image = product_image;
        this.product_quantity=product_quantity;
        this.import_price=import_price;
    }

    public Products(String product_name, int brand_id, int category_id, float product_price, int product_quantity, String product_image,float import_price) {
        this.product_name = product_name;
        this.brand_id = brand_id;
        this.category_id = category_id;
        this.product_price = product_price;
        this.product_quantity = product_quantity;
        this.product_image = product_image;
        this.import_price = import_price;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public Products(String product_name, int brand_id, int category_id, float product_price, String product_image) {
        this.product_name = product_name;
        this.brand_id = brand_id;
        this.category_id = category_id;
        this.product_price = product_price;
        this.product_image = product_image;
        this.productdetail = productdetail;
    }
    
}
