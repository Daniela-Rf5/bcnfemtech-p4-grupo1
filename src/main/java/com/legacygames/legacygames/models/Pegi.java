package com.legacygames.legacygames.models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "pegi") //table name
public class Pegi {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}