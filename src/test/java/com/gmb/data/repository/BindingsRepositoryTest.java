package com.gmb.data.repository;

import com.gmb.data.entity.cons.Brand;
import com.gmb.data.entity.cons.Flex;
import com.gmb.data.entity.cons.Level;
import com.gmb.data.entity.cons.Strap;
import com.gmb.data.entity.eqt.Bindings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class BindingsRepositoryTest {

    private Bindings testBindings;

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private BindingsRepository bindingsRepository;

    @Before
    @Rollback
    public void setup(){

        testBindings = new Bindings("TestBindings", Brand.DRAKE, 2018, Flex.SOFT, Level.BEGINNER, Strap.TRADITIONAL_TOE);
        testEntityManager.persist(testBindings);
        testEntityManager.flush();
    }

    @Test
    public void whenRepositoryLoaded_thenReturnTrue(){

        Assert.assertNotNull(bindingsRepository);
    }

    @Test
    public void whenFindByModel_thenReturnTrue(){

        List<Bindings> foundBindings = bindingsRepository.findByModel("TestBindings");
        Assert.assertNotNull(foundBindings);
        Assert.assertEquals(testBindings.getModel(), foundBindings.stream().findFirst().get().getModel());
    }

    @Test
    public void whenFindByBrand_thenReturnTrue(){

        List<Bindings> foundBindings = bindingsRepository.findByBrand(Brand.DRAKE);
        Assert.assertNotNull(foundBindings);
        Assert.assertEquals(testBindings.getBrand(), foundBindings.stream().findFirst().get().getBrand());
    }

    @Test
    public void whenFindByYear_thenReturnBoard(){

        List<Bindings> foundBindings = bindingsRepository.findByYear(2018);
        Assert.assertNotNull(foundBindings);
        Assert.assertEquals(testBindings.getYear(), foundBindings.stream().findFirst().get().getYear());
    }

    @Test
    public void whenFindByFlex_thenReturnTrue(){

        List<Bindings> foundBindings = bindingsRepository.findByFlex(Flex.SOFT);
        Assert.assertNotNull(foundBindings);
        Assert.assertEquals(testBindings.getFlex(), foundBindings.stream().findFirst().get().getFlex());
    }

    @Test
    public void whenFindByLevel_thenReturnTrue(){

        List<Bindings> foundBindings = bindingsRepository.findByLevel(Level.BEGINNER);
        Assert.assertNotNull(foundBindings);
        Assert.assertEquals(testBindings.getLevel(), foundBindings.stream().findFirst().get().getLevel());
    }

    @Test
    public void whenFindByStrap_thenReturnTrue(){

        List<Bindings> foundBindings = bindingsRepository.findByStrap(Strap.TRADITIONAL_TOE);
        Assert.assertNotNull(foundBindings);
        Assert.assertEquals(testBindings.getLevel(), foundBindings.stream().findFirst().get().getLevel());
    }

}
