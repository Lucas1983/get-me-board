package com.gmb.main.data.repository;

import com.gmb.main.data.entity.cons.Lacing;
import com.gmb.main.data.entity.Boots;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BootsRepository extends EquipmentRepository<Boots>{

    public List<Boots> findByLacing(Lacing lacing);
}
