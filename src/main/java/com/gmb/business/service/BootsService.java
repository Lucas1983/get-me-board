package com.gmb.business.service;

import com.gmb.data.entity.eqt.Boots;
import com.gmb.data.repository.BootsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class BootsService implements EquipmentService<Boots> {

    private BootsRepository bootsRepository;

    @Autowired
    public BootsService(BootsRepository bootsRepository) {
        this.bootsRepository = bootsRepository;
    }

    @Override
    public Boots findOne() throws Exception {
        return null;
    }

    @Override
    public Collection<Boots> findAll() throws Exception {

        Collection coll = new ArrayList();
        bootsRepository.findAll().forEach( e -> coll.add(e) );
        return coll;
    }

    @Override
    public void save(Boots equipment) throws Exception {
        bootsRepository.save(equipment);
    }
}
