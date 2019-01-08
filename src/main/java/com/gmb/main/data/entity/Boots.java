package com.gmb.main.data.entity;

import com.gmb.main.data.entity.cons.Brand;
import com.gmb.main.data.entity.cons.Flex;
import com.gmb.main.data.entity.cons.Lacing;
import com.gmb.main.data.entity.cons.Level;

import javax.persistence.*;

@Entity
@Table(name = "BOOTS")
public class Boots extends Equipment{

    @Column
    @Enumerated(EnumType.STRING)
    Lacing lacing;

    public Boots() {
        super();
    }

    public Boots(String model, Brand brand, int year, Flex flex, Level level, Lacing lacing) {
        super(model, brand, year, flex, level);
        this.lacing = lacing;
    }

    public Lacing getLacing() {
        return lacing;
    }

    public void setLacing(Lacing lacing) {
        this.lacing = lacing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boots)) return false;
        if (!super.equals(o)) return false;

        Boots boots = (Boots) o;

        return lacing == boots.lacing;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (lacing != null ? lacing.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Boots{" + super.toString()+
                "lacing=" + lacing +
                "} ";
    }
}
