package com.gmb.main.business.service;


import com.gmb.main.data.entity.Equipment;

import java.util.Collection;

public interface EquipmentService<T extends Equipment> {

    public T findOne() throws Exception;

    public Collection<T> findAll() throws Exception;

    public void save(T equipment) throws Exception;

    public void delete(T equipment) throws Exception;

    public void deleteById(long id) throws Exception;
}
