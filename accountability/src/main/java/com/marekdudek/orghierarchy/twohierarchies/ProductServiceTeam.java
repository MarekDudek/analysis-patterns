package com.marekdudek.orghierarchy.twohierarchies;

class ProductServiceTeam extends Organization2 {

    ProductServiceTeam(final ProductFamilyServiceTeam parent, final SalesOffice2 salesParent, final String name) {
        super(name, null, null, parent, null);
    }
}
