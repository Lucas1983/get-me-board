package com.gmb.data.repository;

import com.gmb.data.entity.cons.*;
import com.gmb.data.entity.eqt.Board;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class BoardRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void whenRepositoryLoaded_thenReturnTrue(){

        Assert.assertNotNull(boardRepository);
    }

    @Test
    public void whenFindByModel_thenReturnBoard(){

        Board board = new Board("TestModel", Brand.LIB_TECH, 2018, Flex.SOFT, Level.BEGINNER, Type.ALL_MOUNTAIN, Profile.ROCKER, Shape.DIRECTIONAL, Core.WOOD, Base.EXTRUDED);
        testEntityManager.persist(board);
        testEntityManager.flush();

        Board foundBoard = boardRepository.findByModel("TestModel");

        assertThat(board.getModel()).isEqualTo(foundBoard.getModel());
    }
}
