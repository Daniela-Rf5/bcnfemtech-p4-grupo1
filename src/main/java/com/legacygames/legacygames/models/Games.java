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
    private Float originalPrice;
    private String tag;
    private Float discount;
    private Float applyDiscount;
    private String category;
    private String publisher;
    private Long pegi;
    private String pegiDescriptor;

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

    public Float getOriginalPrice(){return originalPrice;}
    public void setOriginalPrice(Float originalPrice){
        this.originalPrice=originalPrice;
    }

    public String getTag(){return tag;}
    public void setTag(String tag) {
        this.tag = tag;
    }

    public Float getDiscount(){return discount;}
        public void setDiscount(Float discount){
        this.discount=discount;
        }
    public Float getApplyDiscount(){return applyDiscount;}
    public void setApplyDiscount(Float applyDiscount){
        this.applyDiscount=applyDiscount;
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

    public String getPegiDescriptor(){return pegiDescriptor;}
    public void setPegiDescriptor(String pegiDescriptor) {
        this.pegiDescriptor = pegiDescriptor;
    }

    //no necesario Override porque
    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", platform='" + platform + '\'' +
                ", yearR='" + yearR + '\'' +
                ", originalPrice='" + originalPrice + '\'' +
                ", tag='" + tag + '\'' +
                ", discount='" + discount + '\'' +
                ", applyDiscount='" + applyDiscount + '\'' +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                ", PEGI='" + pegi + '\'' +
                ", PEGIDescriptor='" + pegiDescriptor + '\'' +
                '}';
    }
}


























