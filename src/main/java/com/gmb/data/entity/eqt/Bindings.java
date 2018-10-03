package com.gmb.data.entity.eqt;

import com.gmb.data.entity.cons.Brand;
import com.gmb.data.entity.cons.Flex;
import com.gmb.data.entity.cons.Level;
import com.gmb.data.entity.cons.Strap;

import javax.persistence.*;

@Entity()
@Table(name = "BINDINGS")
public class Bindings extends  Equipment{

    @Column
    @Enumerated(EnumType.STRING)
    Strap strap;

    public Bindings() {
    }

    public Bindings(String model, Brand brand, int year, Flex flex, Level level, Strap strap) {
        super(model, brand, year, flex, level);
        this.strap = strap;
    }

    public Strap getStrap() {
        return strap;
    }

    public void setStrap(Strap strap) {
        this.strap = strap;
    }

    @Override
    public String toString() {
        return "Bindings{" + super.toString() +
                "strap=" + strap +
                "} ";
    }
}
