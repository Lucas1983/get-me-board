package com.gmb.dummy;

import com.gmb.main.data.entity.cons.*;
import com.gmb.main.data.entity.Board;

import java.util.*;

public class BoardDummyDataCreator {

    public static final List<Board> DUMMY_BOARD_LIST;

    private static final Random RANDOM = new Random();

    private static final List<Brand> BRAND_LIST = Collections.unmodifiableList(Arrays.asList(Brand.values()));
    private static final List<Base> BASE_LIST = Collections.unmodifiableList(Arrays.asList(Base.values()));
    private static final List<Core> CORE_LIST = Collections.unmodifiableList(Arrays.asList(Core.values()));
    private static final List<Flex> FLEX_LIST = Collections.unmodifiableList(Arrays.asList(Flex.values()));
    private static final List<Level> LEVEL_LIST = Collections.unmodifiableList(Arrays.asList(Level.values()));
    private static final List<Profile> PROFILE_LIST = Collections.unmodifiableList(Arrays.asList(Profile.values()));
    private static final List<Shape> SHAPE_LIST = Collections.unmodifiableList(Arrays.asList(Shape.values()));
    private static final List<Type> TYPE_LIST = Collections.unmodifiableList(Arrays.asList(Type.values()));

    private static final int BRAND_SIZE = BRAND_LIST.size();
    private static final int BASE_SIZE = BASE_LIST.size();
    private static final int CORE_SIZE = CORE_LIST.size();
    private static final int FLEX_SIZE = FLEX_LIST.size();
    private static final int LEVEL_SIZE = LEVEL_LIST.size();
    private static final int PROFILE_SIZE = PROFILE_LIST.size();
    private static final int SHAPE_SIZE = SHAPE_LIST.size();
    private static final int TYPE_SIZE = TYPE_LIST.size();

    static {

        DUMMY_BOARD_LIST = new ArrayList<>();

        Board board;

        for (int i = 0; i < 100; i++) {

            board = new Board();
            board.setYear(i);
            board.setModel("Model " + i);
            board.setBrand(BRAND_LIST.get(RANDOM.nextInt(BRAND_SIZE)));
            board.setBase(BASE_LIST.get(RANDOM.nextInt(BASE_SIZE)));
            board.setCore(CORE_LIST.get(RANDOM.nextInt(CORE_SIZE)));
            board.setFlex(FLEX_LIST.get(RANDOM.nextInt(FLEX_SIZE)));
            board.setLevel(LEVEL_LIST.get(RANDOM.nextInt(LEVEL_SIZE)));
            board.setProfile(PROFILE_LIST.get(RANDOM.nextInt(PROFILE_SIZE)));
            board.setShape(SHAPE_LIST.get(RANDOM.nextInt(SHAPE_SIZE)));
            board.setType(TYPE_LIST.get(RANDOM.nextInt(TYPE_SIZE)));

            DUMMY_BOARD_LIST.add(board);
        }
    }

    public static void main(String[] args) {

        System.out.println(DUMMY_BOARD_LIST.toString());

    }

}
