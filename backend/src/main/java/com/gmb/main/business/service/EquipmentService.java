package com.gmb.main.business.service;


import com.gmb.main.data.entity.Equipment;

import java.util.Collection;
import java.util.Optional;

public interface EquipmentService<T extends Equipment> {

    public Optional<T> findOneById(Long id) throws Exception;

    public Collection<T> findAll() throws Exception;

    public void create(T equipment) throws Exception;

    public void update(T equipment) throws Exception;

    public void remove(T equipment) throws Exception;

    public void removeById(Long id) throws Exception;
}
