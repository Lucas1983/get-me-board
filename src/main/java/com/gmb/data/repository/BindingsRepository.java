package com.gmb.data.repository;

import com.gmb.data.entity.cons.Strap;
import com.gmb.data.entity.eqt.Bindings;
import org.springframework.stereotype.Repository;

@Repository
public interface BindingsRepository extends EquipmentRepository<Bindings> {

    default public Bindings findByStrap (Strap strap) { return null; };
}
