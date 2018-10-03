package com.gmb.data.entity.eqt;

import com.gmb.data.entity.cons.*;

import javax.persistence.*;

@Entity
@Table(name = "BOARD")
public class Board extends Equipment{

    @Column
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column
    @Enumerated(EnumType.STRING)
    private Profile profile;

    @Column
    @Enumerated(EnumType.STRING)
    private Shape shape;

    @Column
    @Enumerated(EnumType.STRING)
    private Core core;

    @Column
    @Enumerated(EnumType.STRING)
    private Base base;

    public Board() {
    }

    public Board(String model, Brand brand, int year, Flex flex, Level level, Type type, Profile profile, Shape shape, Core core, Base base) {
        super(model, brand, year, flex, level);
        this.type = type;
        this.profile = profile;
        this.shape = shape;
        this.core = core;
        this.base = base;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Core getCore() {
        return core;
    }

    public void setCore(Core core) {
        this.core = core;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Board{" + super.toString() +
                "type=" + type +
                ", profile=" + profile +
                ", shape=" + shape +
                ", core=" + core +
                ", base=" + base +
                "} ";
    }
}
