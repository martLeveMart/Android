package com.example.practice.plats;

import java.io.Serializable;

public class Plats implements Serializable {
    private Double prix;
    private String label;
    private String imageURL;
    private String description;

    public Plats(String img, String name, Double prix, String des){
        this.prix = prix;
        label = name;
        imageURL = img;
        description = des;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
