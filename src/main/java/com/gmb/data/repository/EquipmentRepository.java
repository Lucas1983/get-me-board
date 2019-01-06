package com.gmb.data.repository;

import com.gmb.data.entity.cons.Brand;
import com.gmb.data.entity.cons.Flex;
import com.gmb.data.entity.cons.Level;
import com.gmb.data.entity.eqt.Equipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface EquipmentRepository<T extends Equipment> extends CrudRepository<T, Long> {

    public T findById(long id);

    public List<T> findByModel(String model);

    public List<T> findByBrand(Brand brand);

    public List<T> findByYear(int year);

    public List<T> findByFlex(Flex flex);

    public List<T> findByLevel(Level level);

}
