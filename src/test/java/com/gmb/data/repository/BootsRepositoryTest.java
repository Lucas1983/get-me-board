package com.gmb.data.repository;

import com.gmb.data.entity.cons.Brand;
import com.gmb.data.entity.cons.Flex;
import com.gmb.data.entity.cons.Lacing;
import com.gmb.data.entity.cons.Level;
import com.gmb.data.entity.eqt.Boots;
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
public class BootsRepositoryTest {

    private Boots testBoots;

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private BootsRepository bootsRepository;

    @Before
    @Rollback
    public void setup(){

        testBoots = new Boots("TestBoots", Brand.SALOMON, 2018, Flex.SOFT, Level.BEGINNER, Lacing.TRADITIONAL);
        testEntityManager.persist(testBoots);
        testEntityManager.flush();
    }

    @Test
    public void whenRepositoryLoaded_thenReturnTrue(){

        Assert.assertNotNull(bootsRepository);
    }

    @Test
    public void whenFindByModel_thenReturnTrue(){

        List<Boots> foundBoots = bootsRepository.findByModel("TestBoots");
        Assert.assertNotNull(foundBoots);
        Assert.assertEquals(testBoots.getModel(), foundBoots.stream().findFirst().get().getModel());
    }

    @Test
    public void whenFindByBrand_thenReturnTrue(){

        List<Boots> foundBoots = bootsRepository.findByBrand(Brand.SALOMON);
        Assert.assertNotNull(foundBoots);
        Assert.assertEquals(testBoots.getBrand(), foundBoots.stream().findFirst().get().getBrand());
    }

    @Test
    public void whenFindByYear_thenReturnBoard(){

        List<Boots> foundBoots = bootsRepository.findByYear(2018);
        Assert.assertNotNull(foundBoots);
        Assert.assertEquals(testBoots.getYear(), foundBoots.stream().findFirst().get().getYear());
    }

    @Test
    public void whenFindByFlex_thenReturnTrue(){

        List<Boots> foundBoots = bootsRepository.findByFlex(Flex.SOFT);
        Assert.assertNotNull(foundBoots);
        Assert.assertEquals(testBoots.getFlex(), foundBoots.stream().findFirst().get().getFlex());
    }

    @Test
    public void whenFindByLevel_thenReturnTrue(){

        List<Boots> foundBoots = bootsRepository.findByLevel(Level.BEGINNER);
        Assert.assertNotNull(foundBoots);
        Assert.assertEquals(testBoots.getLevel(), foundBoots.stream().findFirst().get().getLevel());
    }

    @Test
    public void whenFindByLacings_thenReturnTrue(){

        List<Boots> foundBoots = bootsRepository.findByLacing(Lacing.TRADITIONAL);
        Assert.assertNotNull(foundBoots);
        Assert.assertEquals(testBoots.getLacing(), foundBoots.stream().findFirst().get().getLacing());
    }

}
