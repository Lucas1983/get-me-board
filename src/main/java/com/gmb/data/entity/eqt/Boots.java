package com.gmb.data.entity.eqt;

import com.gmb.data.entity.cons.Brand;
import com.gmb.data.entity.cons.Flex;
import com.gmb.data.entity.cons.Lacing;
import com.gmb.data.entity.cons.Level;

import javax.persistence.*;

@Entity
@Table(name = "BOOTS")
public class Boots extends Equipment{

    @Column
    @Enumerated(EnumType.STRING)
    Lacing lacing;

    public Boots() {
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
    public String toString() {
        return "Boots{" + super.toString()+
                "lacing=" + lacing +
                "} ";
    }
}
