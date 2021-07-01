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
    private Integer releaseYear;
    private Double price;
    private String tag;
    private Integer discount;
    private Double discountPrice;  //discounted price
    private String publisher;

    @ManyToOne
    @JoinColumn(name="pegi_id")
    private Pegi pegi;
    private String pegiDescriptor;

    @ManyToOne
    @JoinColumn(name="platform_id")
    private Platform platform;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Long getId() {return id;}
    public void setId(Long id){
        this.id=id;
    }

    public String getTitle() {return title;}
    public void setTitle(String title){
        this.title=title;
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

    public String getPublisher(){return publisher;}
    public void setPublisher(String publisher){
        this.publisher=publisher;
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
                '}';
    }

    public Pegi getPegi() {
        return pegi;
    }

    public void setPegi(Pegi pegi) {
        this.pegi = pegi;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}


























