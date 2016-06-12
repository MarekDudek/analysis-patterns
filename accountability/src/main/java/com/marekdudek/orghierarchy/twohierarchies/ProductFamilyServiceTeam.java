package com.marekdudek.orghierarchy.twohierarchies;

import java.util.ArrayList;

class ProductFamilyServiceTeam extends Organization2 {

    ProductFamilyServiceTeam(final ProductSubtypeServiceDivision parent, final String name) {
        super(name, null, null, parent, new ArrayList<>());
    }
}
