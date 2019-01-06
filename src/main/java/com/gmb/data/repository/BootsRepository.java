package com.gmb.data.repository;

import com.gmb.data.entity.cons.Lacing;
import com.gmb.data.entity.eqt.Boots;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BootsRepository extends EquipmentRepository<Boots>{

    public List<Boots> findByLacing(Lacing lacing);
}
