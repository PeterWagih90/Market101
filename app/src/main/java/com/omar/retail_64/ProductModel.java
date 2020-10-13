package com.omar.retail_64;

public class ProductModel {

    private int image;
    private String title;
    private String details;
    private String price;

    public ProductModel() {
    }

    public ProductModel(int image, String title, String details, String price) {
        this.image = image;
        this.title = title;
        this.details = details;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
