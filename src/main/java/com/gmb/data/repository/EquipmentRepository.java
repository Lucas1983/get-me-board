package com.gmb.data.repository;

import com.gmb.data.entity.eqt.Equipment;
import com.gmb.data.entity.cons.Brand;
import com.gmb.data.entity.cons.Flex;
import com.gmb.data.entity.cons.Level;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface EquipmentRepository<T extends Equipment> extends CrudRepository<T, Long> {

    public T findById(long id);

    public T findByModel(String model);

    public T findByBrand(Brand brand);

    public T findByYear(int year);

    public T findByFlex(Flex flex);

    public T findByLevel(Level level);

}
