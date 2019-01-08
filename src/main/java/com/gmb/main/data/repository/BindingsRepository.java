package com.gmb.main.data.repository;

import com.gmb.main.data.entity.cons.Strap;
import com.gmb.main.data.entity.Bindings;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BindingsRepository extends EquipmentRepository<Bindings> {

    public List<Bindings> findByStrap (Strap strap);
}
