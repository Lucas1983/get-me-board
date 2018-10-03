package com.gmb.data.repository;

import com.gmb.data.entity.cons.Lacing;
import com.gmb.data.entity.eqt.Boots;
import org.springframework.stereotype.Repository;

@Repository
public interface BootsRepository extends EquipmentRepository<Boots>{

    default public Boots findByLacing(Lacing lacing) { return null; };
}
