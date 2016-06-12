package com.marekdudek.orghierarchy.twohierarchies;

import java.util.ArrayList;

class Division2 extends Organization2 {

    Division2(final Region2 salesParent, final String name) {
        super(name, salesParent, new ArrayList<>());
    }
}
