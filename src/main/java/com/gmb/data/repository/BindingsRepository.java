package com.gmb.data.repository;

import com.gmb.data.entity.cons.Strap;
import com.gmb.data.entity.eqt.Bindings;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BindingsRepository extends EquipmentRepository<Bindings> {

    public List<Bindings> findByStrap (Strap strap);
}
