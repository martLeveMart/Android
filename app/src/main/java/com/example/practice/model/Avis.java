package com.example.practice.model;

public class Avis {
    private String id;
    private String mail;
    private String description;
    private Integer nbStar;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNbStar() {
        return nbStar;
    }

    public void setNbStar(Integer nbStar) {
        this.nbStar = nbStar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
