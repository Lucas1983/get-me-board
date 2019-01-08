package com.gmb.main.business.service;

import com.gmb.main.data.entity.Board;
import com.gmb.main.data.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class BoardService implements EquipmentService<Board> {

    private BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Optional<Board> findOneById(Long id) throws Exception {
        return boardRepository.findOneById(id);
    }

    @Override
    public Collection<Board> findAll() throws Exception {
        Collection coll = new ArrayList();
        boardRepository.findAll().forEach( e -> coll.add(e) );
        return coll;
    }

    @Override
    public void create(Board board) throws Exception {
        boardRepository.create(board);
    }

    @Override
    public void update(Board board) throws Exception {
        boardRepository.update(board);
    }

    @Override
    public void remove(Board board) throws Exception {
        boardRepository.delete(board);
    }

    @Override
    public void removeById(Long id) throws Exception {
        boardRepository.deleteById(id);
    }
}
