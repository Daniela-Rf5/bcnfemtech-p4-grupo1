package com.legacygames.legacygames.models;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="games")

public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;
    private String title;
    private String platform;
    private Integer releaseYear;
    private Double price;
    private String tag;
    private Integer discount;
    private Double discountPrice;  //discounted price
    private String category;
    private String publisher;
    private Integer pegi;
    private String pegiDescriptor;
    private String photo;

    public String getPegiDescriptor() {
        return pegiDescriptor;
    }

    public void setPegiDescriptor(String pegiDescriptor) {
        this.pegiDescriptor = pegiDescriptor;
    }

    public Long getId() {return id;}
    public void setId(Long id){
        this.id=id;
    }

    public String getTitle() {return title;}
    public void setTitle(String title){
        this.title=title;
    }

    public String getPlatform(){return platform;}
    public void setPlatform(String platform){
        this.platform=platform;
    }

    public Integer getReleaseYear(){return releaseYear;}
    public void setReleaseYear(Integer releaseYear){
        this.releaseYear = releaseYear;
    }

    public Double getPrice(){return price;}
    public void setPrice(Double price){
        this.price =price;
    }

    public String getTag(){return tag;}
    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getDiscount(){return discount;}
        public void setDiscount(Integer discount){
        this.discount=discount;
        }

    public Double getDiscountPrice(){return discountPrice;}
    public void setDiscountPrice(Double discountPrice){
        this.discountPrice = discountPrice;
    }

    public String getCategory(){return category;}
    public void setCategory(String category){
        this.category=category;
    }

    public String getPublisher(){return publisher;}
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }

    public Integer getPegi() {return pegi;}
    public void setPegi(Integer pegi){
        this.pegi=pegi;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getPhotoImagePath() {
        if (photo == null || id == null) return null;
        return "/game-photo/" + id + "/" + photo;
    }


    //no necesario Override porque
    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", platform='" + platform + '\'' +
                ", yearR='" + releaseYear + '\'' +
                ", OriginalPrice='" + price + '\'' +
                ", tag='" + tag + '\'' +
                ", discount='" + discount + '\'' +
                ", applyDiscount='" + discountPrice + '\'' +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                ", PEGI='" + pegi + '\'' +
                ", PEGIDescriptor='" + pegiDescriptor + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }


}


























