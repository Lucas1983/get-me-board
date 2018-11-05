package com.gmb.business.service;


import com.gmb.data.entity.eqt.Equipment;

import java.util.Collection;

public interface EquipmentService<T extends Equipment> {

    public T findOne() throws Exception;

    public Collection<T> findAll() throws Exception;

    public void save(T equipment) throws Exception;

}
