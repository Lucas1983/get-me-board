package com.gmb.main.data.entity;

import com.gmb.main.data.entity.cons.Brand;
import com.gmb.main.data.entity.cons.Flex;
import com.gmb.main.data.entity.cons.Level;
import com.gmb.main.data.entity.cons.Strap;

import javax.persistence.*;

@Entity()
@Table(name = "BINDINGS")
public class Bindings extends  Equipment{

    @Column
    @Enumerated(EnumType.STRING)
    Strap strap;

    public Bindings() {
        super();
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bindings)) return false;
        if (!super.equals(o)) return false;

        Bindings bindings = (Bindings) o;

        return strap == bindings.strap;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (strap != null ? strap.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bindings{" + super.toString() +
                "strap=" + strap +
                "} ";
    }
}
