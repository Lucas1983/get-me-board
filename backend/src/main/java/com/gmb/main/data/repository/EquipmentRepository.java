package com.gmb.main.data.repository;

import com.gmb.main.data.entity.Equipment;
import com.gmb.main.data.entity.cons.Brand;
import com.gmb.main.data.entity.cons.Flex;
import com.gmb.main.data.entity.cons.Level;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface EquipmentRepository<T extends Equipment> extends CrudRepository<T, Long> {

    default public Optional<T> findOneById(Long id) {
        return findById(id);
    }

    public List<T> findByModel(String model);

    public List<T> findByBrand(Brand brand);

    public List<T> findByYear(int year);

    public List<T> findByFlex(Flex flex);

    public List<T> findByLevel(Level level);

    default public T create(T equipment){
        return save(equipment);
    }

    default public T update(T equipment){
        return save(equipment);
    }

    default public void remove(T equipment){
        delete(equipment);
    }

}
