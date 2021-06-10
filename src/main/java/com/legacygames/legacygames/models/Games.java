package com.legacygames.legacygames.models;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="games")

public class Games implements Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;
    private String title;
    private String platform;
    private Integer yearR;
    private Float Price;
    private String tag;
    private Integer discount;
    private Float discounted;  //discounted price
    private String category;
    private String publisher;
    private Long pegi;

    public String getDescripter() {
        return descripter;
    }

    public void setDescripter(String descripter) {
        this.descripter = descripter;
    }

    private String descripter; //pegi descriptor
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

    public Integer getYearR(){return yearR;}
    public void setYear(Integer year){
        this.yearR=yearR;
    }

    public Float getPrice(){return Price;}
    public void setPrice(Float Price){
        this.Price=Price;
    }

    public String getTag(){return tag;}
    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getDiscount(){return discount;}
        public void setDiscount(Integer discount){
        this.discount=discount;
        }

    public Float getDiscounted(){return discounted;}
    public void setDiscounted(Float Discounted){
        this.discounted=discounted;
    }

    public String getCategory(){return category;}
    public void setCategory(String category){
        this.category=category;
    }

    public String getPublisher(){return publisher;}
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }

    public Long getPegi() {return pegi;}
    public void setPegi(Long pegi){
        this.pegi=pegi;
    }


    //no necesario Override porque
    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", platform='" + platform + '\'' +
                ", yearR='" + yearR + '\'' +
                ", OriginalPrice='" + Price + '\'' +
                ", tag='" + tag + '\'' +
                ", discount='" + discount + '\'' +
                ", applyDiscount='" + discounted + '\'' +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                ", PEGI='" + pegi + '\'' +
                ", PEGIDescriptor='" + descripter + '\'' +
                '}';
    }
}


























