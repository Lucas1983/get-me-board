package com.gmb.dummy;

import com.gmb.main.data.entity.cons.Brand;
import com.gmb.main.data.entity.cons.Flex;
import com.gmb.main.data.entity.cons.Level;
import com.gmb.main.data.entity.cons.Strap;
import com.gmb.main.data.entity.Bindings;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class BindingsDummyDataCreator {

    public static final List<Bindings> DUMMY_BINDINGS_LIST;

    private static final Random RANDOM = new Random();

    private static final List<Brand> BRAND_LIST = Collections.unmodifiableList(Arrays.asList(Brand.values()));
    private static final List<Flex> FLEX_LIST = Collections.unmodifiableList(Arrays.asList(Flex.values()));
    private static final List<Level> LEVEL_LIST = Collections.unmodifiableList(Arrays.asList(Level.values()));
    private static final List<Strap> STRAP_LIST = Collections.unmodifiableList(Arrays.asList(Strap.values()));

    private static final int BRAND_SIZE = BRAND_LIST.size();
    private static final int FLEX_SIZE = FLEX_LIST.size();
    private static final int LEVEL_SIZE = LEVEL_LIST.size();
    private static final int STRAP_SIZE = STRAP_LIST.size();

    static {

        DUMMY_BINDINGS_LIST = new ArrayList<>();

        Bindings bindings;

        for (int i = 0; i < 100; i++) {

            bindings = new Bindings();
            bindings.setYear(i);
            bindings.setModel("Model " + i);
            bindings.setBrand(BRAND_LIST.get(RANDOM.nextInt(BRAND_SIZE)));
            bindings.setFlex(FLEX_LIST.get(RANDOM.nextInt(FLEX_SIZE)));
            bindings.setLevel(LEVEL_LIST.get(RANDOM.nextInt(LEVEL_SIZE)));
            bindings.setStrap(STRAP_LIST.get(RANDOM.nextInt(STRAP_SIZE)));

            DUMMY_BINDINGS_LIST.add(bindings);
        }
    }

    public static void main(String[] args) {

        System.out.println(DUMMY_BINDINGS_LIST.toString());
        createSql();
    }

    private static void createSql() {

        Path file = Paths.get("./sql/bindings.txt");
        System.out.println(file.toAbsolutePath());
    }

}
