/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author HuongHoang
 */
public class Orders {

    private int order_id;
    private int customer_id;
    private Date order_date;
    private Date shipped_date;
    private String name;
    private String address;
    private String phone;
    private String email;
    private OrderLine orderLine;

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private Customers customer;
    private ArrayList<OrderLine> lines = new ArrayList<OrderLine>();
    private ArrayList<Orders> orderses = new ArrayList<Orders>();

    public float getTotal() {
        float sum = 0;
        for (OrderLine line : lines) {
            sum += line.getTotal();
        }
        return sum;
    }


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getShipped_date() {
        return shipped_date;
    }

    public void setShipped_date(Date shipped_date) {
        this.shipped_date = shipped_date;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public ArrayList<OrderLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<OrderLine> lines) {
        this.lines = lines;
    }


}
