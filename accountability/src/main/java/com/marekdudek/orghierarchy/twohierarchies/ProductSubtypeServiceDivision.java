package com.marekdudek.orghierarchy.twohierarchies;

import java.util.ArrayList;

class ProductSubtypeServiceDivision extends Organization2 {

    ProductSubtypeServiceDivision(final ProductTypeServiceDivision parent, final String name) {
        super(name, null, null, parent, new ArrayList<>());
    }
}
