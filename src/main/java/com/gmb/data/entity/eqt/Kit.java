package com.gmb.data.entity.eqt;

import javax.persistence.*;

@Entity
public class Kit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @ManyToOne
    @JoinColumn(name = "board_fk")
    private Board board;

    @ManyToOne
    @JoinColumn(name = "boots_fk")
    private Boots boots;

    @ManyToOne
    @JoinColumn(name = "bindings_fk")
    private Bindings bindings;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Boots getBoots() {
        return boots;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

    public Bindings getBindings() {
        return bindings;
    }

    public void setBindings(Bindings bindings) {
        this.bindings = bindings;
    }
}
