package com.gmb.data.repository;

import com.gmb.data.entity.cons.*;
import com.gmb.data.entity.eqt.Board;
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
public class BoardRepositoryTest {

    private Board testBoard;

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private BoardRepository boardRepository;

    @Before
    @Rollback
    public void setup(){

        testBoard = new Board("TestBoard", Brand.LIB_TECH, 2018, Flex.SOFT, Level.BEGINNER, Type.ALL_MOUNTAIN, Profile.ROCKER, Shape.DIRECTIONAL, Core.WOOD, Base.EXTRUDED);
        testEntityManager.persist(testBoard);
        testEntityManager.flush();
    }

    @Test
    public void whenRepositoryLoaded_thenReturnTrue(){

        Assert.assertNotNull(boardRepository);
    }

    @Test
    public void whenFindByModel_thenReturnTrue(){

        List<Board> foundBoard = boardRepository.findByModel("TestBoard");
        Assert.assertNotNull(foundBoard);
        Assert.assertEquals(testBoard.getModel(), foundBoard.stream().findFirst().get().getModel());
    }

    @Test
    public void whenFindByBrand_thenReturnTrue(){

        List<Board> foundBoard = boardRepository.findByBrand(Brand.LIB_TECH);
        Assert.assertNotNull(foundBoard);
        Assert.assertEquals(testBoard.getBrand(), foundBoard.stream().findFirst().get().getBrand());
    }

    @Test
    public void whenFindByYear_thenReturnTrue(){

        List<Board> foundBoard = boardRepository.findByYear(2018);
        Assert.assertNotNull(foundBoard);
        Assert.assertEquals(testBoard.getYear(), foundBoard.stream().findFirst().get().getYear());
    }

    @Test
    public void whenFindByFlex_thenReturnTrue(){

        List<Board> foundBoard = boardRepository.findByFlex(Flex.SOFT);
        Assert.assertNotNull(foundBoard);
        Assert.assertEquals(testBoard.getFlex(), foundBoard.stream().findFirst().get().getFlex());
    }

    @Test
    public void whenFindByLevel_thenReturnTrue(){

        List<Board> foundBoard = boardRepository.findByLevel(Level.BEGINNER);
        Assert.assertNotNull(foundBoard);
        Assert.assertEquals(testBoard.getLevel(), foundBoard.stream().findFirst().get().getLevel());
    }

    @Test
    public void whenFindByType_thenReturnTrue(){

        List<Board> foundBoard = boardRepository.findByType(Type.ALL_MOUNTAIN);
        Assert.assertNotNull(foundBoard);
        Assert.assertEquals(testBoard.getType(), foundBoard.stream().findFirst().get().getType());
    }

    @Test
    public void whenFindByProfile_thenReturnTrue(){

        List<Board> foundBoard = boardRepository.findByProfile(Profile.ROCKER);
        Assert.assertNotNull(foundBoard);
        Assert.assertEquals(testBoard.getProfile(), foundBoard.stream().findFirst().get().getProfile());
    }

    @Test
    public void whenFindByShape_thenReturnTrue(){

        List<Board> foundBoard = boardRepository.findByShape(Shape.DIRECTIONAL);
        Assert.assertNotNull(foundBoard);
        Assert.assertEquals(testBoard.getShape(), foundBoard.stream().findFirst().get().getShape());
    }

    @Test
    public void whenFindByCore_thenReturnTrue(){

        List<Board> foundBoard = boardRepository.findByCore(Core.WOOD);
        Assert.assertNotNull(foundBoard);
        Assert.assertEquals(testBoard.getCore(), foundBoard.stream().findFirst().get().getCore());
    }

    @Test
    public void whenFindByBase_thenReturnTrue(){

        List<Board> foundBoard = boardRepository.findByBase(Base.EXTRUDED);
        Assert.assertNotNull(foundBoard);
        Assert.assertEquals(testBoard.getBase(), foundBoard.stream().findFirst().get().getBase());
    }

}
