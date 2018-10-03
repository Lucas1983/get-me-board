package com.gmb.data.repository;

import com.gmb.data.entity.cons.*;
import com.gmb.data.entity.eqt.Board;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends EquipmentRepository<Board> {

    default public Board findByType(Type type){ return null; };

    default public Board findByProfile(Profile profile){ return null; };

    default public Board findByShape(Shape shape){ return null; };

    default public Board findByCore(Core core){ return null; };

    default public Board findByBase(Base base) { return null; };

}
