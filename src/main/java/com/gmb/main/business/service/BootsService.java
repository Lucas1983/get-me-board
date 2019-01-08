package com.gmb.main.business.service;

import com.gmb.main.data.entity.Boots;
import com.gmb.main.data.repository.BootsRepository;
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
    public void save(Boots boots) throws Exception {
        bootsRepository.save(boots);
    }

    @Override
    public void delete(Boots boots) throws Exception {
        bootsRepository.delete(boots);
    }

    @Override
    public void deleteById(long id) throws Exception {
        bootsRepository.deleteById(id);
    }
}
