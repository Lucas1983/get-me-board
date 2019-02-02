package com.gmb.main.data.entity;

import com.gmb.main.data.entity.cons.Brand;
import com.gmb.main.data.entity.cons.Flex;
import com.gmb.main.data.entity.cons.Level;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipment)) return false;

        Equipment equipment = (Equipment) o;

        if (id != equipment.id) return false;
        if (year != equipment.year) return false;
        if (model != null ? !model.equals(equipment.model) : equipment.model != null) return false;
        if (brand != equipment.brand) return false;
        if (flex != equipment.flex) return false;
        return level == equipment.level;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (flex != null ? flex.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        return result;
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
