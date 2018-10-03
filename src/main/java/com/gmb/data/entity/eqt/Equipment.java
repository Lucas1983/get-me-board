package com.gmb.data.entity.eqt;

import com.gmb.data.entity.cons.Brand;
import com.gmb.data.entity.cons.Flex;
import com.gmb.data.entity.cons.Level;

import javax.persistence.*;

@MappedSuperclass
public abstract class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column
    private String model;

    @Column
    @Enumerated(EnumType.STRING)
    private Brand brand;

    @Column
    private int year;

    @Column
    @Enumerated(EnumType.STRING)
    private Flex flex;

    @Column
    @Enumerated(EnumType.STRING)
    private Level level;

    public Equipment() {
    }

    public Equipment(String model, Brand brand, int year, Flex flex, Level level) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.flex = flex;
        this.level = level;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Flex getFlex() {
        return flex;
    }

    public void setFlex(Flex flex) {
        this.flex = flex;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand=" + brand +
                ", year=" + year +
                ", flex=" + flex +
                ", level=" + level +
                '}';
    }
}
