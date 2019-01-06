package com.gmb.business.service;

import com.gmb.data.entity.eqt.Bindings;
import com.gmb.data.repository.BindingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class BindingsService implements EquipmentService<Bindings> {

    private BindingsRepository bindingsRepository;

    @Autowired
    public BindingsService(BindingsRepository bindingsRepository) {
        this.bindingsRepository = bindingsRepository;
    }

    @Override
    public Bindings findOne() throws Exception {
        return null;
    }

    @Override
    public Collection<Bindings> findAll() throws Exception {
        Collection coll = new ArrayList();
        bindingsRepository.findAll().forEach( e -> coll.add(e) );
        return coll;
    }

    @Override
    public void save(Bindings bindings) throws Exception {
        bindingsRepository.save(bindings);
    }

    @Override
    public void delete(Bindings bindings) throws Exception {
        bindingsRepository.delete(bindings);
    }

    @Override
    public void deleteById(long id) throws Exception {
        bindingsRepository.deleteById(id);
    }

}
