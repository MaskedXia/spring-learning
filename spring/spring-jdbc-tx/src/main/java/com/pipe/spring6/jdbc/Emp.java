package com.pipe.spring6.jdbc;

public class Emp {
    int order_id;
    String order_name;

    @Override
    public String toString() {
        return "Emp{" +
                "order_id=" + order_id +
                ", order_name='" + order_name + '\'' +
                '}';
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }
}
