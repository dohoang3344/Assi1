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
public class ProductDetail {
    private  int product_id;
    private String detail;
    private String guarantee;

    public ProductDetail() {
    }

    public ProductDetail(int product_id, String detail, String guarantee) {
        this.product_id = product_id;
        this.detail = detail;
        this.guarantee = guarantee;
    }

    

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public ProductDetail(String detail, String guarantee) {
        this.detail = detail;
        this.guarantee = guarantee;
    }
    
    
}
