package com.gmb.main.business.service;

import com.gmb.main.data.entity.Bindings;
import com.gmb.main.data.repository.BindingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class BindingsService implements EquipmentService<Bindings> {

    private BindingsRepository bindingsRepository;

    @Autowired
    public BindingsService(BindingsRepository bindingsRepository) {
        this.bindingsRepository = bindingsRepository;
    }

    @Override
    public Optional<Bindings> findOneById(Long id) throws Exception {
        return bindingsRepository.findOneById(id);
    }

    @Override
    public Collection<Bindings> findAll() throws Exception {
        Collection coll = new ArrayList();
        bindingsRepository.findAll().forEach( e -> coll.add(e) );
        return coll;
    }

    @Override
    public void create(Bindings bindings) throws Exception {
        bindingsRepository.create(bindings);
    }

    @Override
    public void update(Bindings bindings) throws Exception {
        bindingsRepository.update(bindings);
    }

    @Override
    public void remove(Bindings bindings) throws Exception {
        bindingsRepository.delete(bindings);
    }

    @Override
    public void removeById(Long id) throws Exception {
        bindingsRepository.deleteById(id);
    }

}
