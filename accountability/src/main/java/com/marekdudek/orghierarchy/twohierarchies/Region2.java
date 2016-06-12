package com.marekdudek.orghierarchy.twohierarchies;

import java.util.ArrayList;

class Region2 extends Organization2 {

    Region2(final OperatingUnit2 unit, final String name) {
        super(name, unit, new ArrayList<>(), null, null);
    }
}
