package com.gmb.main.data.repository;

import com.gmb.main.data.entity.cons.*;
import com.gmb.main.data.entity.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends EquipmentRepository<Board> {

    public List<Board> findByType(Type type);

    public List<Board> findByProfile(Profile profile);

    public List<Board> findByShape(Shape shape);

    public List<Board> findByCore(Core core);

    public List<Board> findByBase(Base base);

}
