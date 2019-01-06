package com.gmb.business.service;

import com.gmb.data.entity.eqt.Board;
import com.gmb.data.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class BoardService implements EquipmentService<Board> {

    private BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Board findOne() throws Exception {
        return null;
    }

    @Override
    public Collection<Board> findAll() throws Exception {
        Collection coll = new ArrayList();
        boardRepository.findAll().forEach( e -> coll.add(e) );
        return coll;
    }

    @Override
    public void save(Board board) throws Exception {
        boardRepository.save(board);
    }

    @Override
    public void delete(Board board) throws Exception {
        boardRepository.delete(board);
    }

    @Override
    public void deleteById(long id) throws Exception {
        boardRepository.deleteById(id);
    }
}
