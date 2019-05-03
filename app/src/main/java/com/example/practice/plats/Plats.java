package com.example.practice.plats;

public class Plats {
    private Double prix;
    private String label;
    private String imageURL;

    public Plats(String img, String name, Double prix){
        this.prix = prix;
        label = name;
        imageURL = img;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
