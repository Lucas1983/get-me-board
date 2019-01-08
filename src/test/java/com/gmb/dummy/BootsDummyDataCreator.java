package com.gmb.dummy;

import com.gmb.main.data.entity.cons.Brand;
import com.gmb.main.data.entity.cons.Flex;
import com.gmb.main.data.entity.cons.Lacing;
import com.gmb.main.data.entity.cons.Level;
import com.gmb.main.data.entity.Boots;

import java.util.*;

public class BootsDummyDataCreator {

    public static final List<Boots> DUMMY_BOOTS_LIST;

    private static final Random RANDOM = new Random();

    private static final List<Brand> BRAND_LIST = Collections.unmodifiableList(Arrays.asList(Brand.values()));
    private static final List<Flex> FLEX_LIST = Collections.unmodifiableList(Arrays.asList(Flex.values()));
    private static final List<Level> LEVEL_LIST = Collections.unmodifiableList(Arrays.asList(Level.values()));
    private static final List<Lacing> LACING_LIST = Collections.unmodifiableList(Arrays.asList(Lacing.values()));

    private static final int BRAND_SIZE = BRAND_LIST.size();
    private static final int FLEX_SIZE = FLEX_LIST.size();
    private static final int LEVEL_SIZE = LEVEL_LIST.size();
    private static final int LACING_SIZE = LACING_LIST.size();

    static {

        DUMMY_BOOTS_LIST = new ArrayList<>();

        Boots boots;

        for (int i = 0; i < 100; i++) {

            boots = new Boots();
            boots.setYear(i);
            boots.setModel("Model " + i);
            boots.setBrand(BRAND_LIST.get(RANDOM.nextInt(BRAND_SIZE)));
            boots.setFlex(FLEX_LIST.get(RANDOM.nextInt(FLEX_SIZE)));
            boots.setLevel(LEVEL_LIST.get(RANDOM.nextInt(LEVEL_SIZE)));
            boots.setLacing(LACING_LIST.get(RANDOM.nextInt(LACING_SIZE)));

            DUMMY_BOOTS_LIST.add(boots);
        }
    }

    public static void main(String[] args) {

        System.out.println(DUMMY_BOOTS_LIST.toString());

    }

}
