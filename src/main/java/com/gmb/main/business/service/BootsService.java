package com.gmb.main.business.service;

import com.gmb.main.data.entity.Boots;
import com.gmb.main.data.repository.BootsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class BootsService implements EquipmentService<Boots> {

    private BootsRepository bootsRepository;

    @Autowired
    public BootsService(BootsRepository bootsRepository) {
        this.bootsRepository = bootsRepository;
    }

    @Override
    public Optional<Boots> findOneById(Long id) throws Exception {
        return bootsRepository.findOneById(id);
    }

    @Override
    public Collection<Boots> findAll() throws Exception {

        Collection coll = new ArrayList();
        bootsRepository.findAll().forEach( e -> coll.add(e) );
        return coll;
    }

    @Override
    public void create(Boots boots) throws Exception {
        bootsRepository.create(boots);
    }

    @Override
    public void update(Boots boots) throws Exception {
        bootsRepository.update(boots);
    }

    @Override
    public void remove(Boots boots) throws Exception {
        bootsRepository.delete(boots);
    }

    @Override
    public void removeById(Long id) throws Exception {
        bootsRepository.deleteById(id);
    }
}
