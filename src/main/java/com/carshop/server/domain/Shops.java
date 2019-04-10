package com.carshop.server.domain;

public class Shops {

    private String shopId;      //商户ID
    private String shopName;    //商户名
    private String password;    //密码
    private Brands brand;     //品牌ID
    private String phone;       //联系电话
    private String token;       //token
    private String status;      //登陆状态

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Shops{" +
                "shopId='" + shopId + '\'' +
                ", shopName='" + shopName + '\'' +
                ", password='" + password + '\'' +
                ", brand=" + brand +
                ", phone='" + phone + '\'' +
                ", token='" + token + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
