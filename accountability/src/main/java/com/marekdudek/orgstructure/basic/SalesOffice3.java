package com.marekdudek.orgstructure.basic;

import static com.marekdudek.orgstructure.basic.OrganizationStructureType3.SALES;

public class SalesOffice3 extends Organization3 {

    public SalesOffice3(final Organization3 parent, final String name) {
        super(parent, SALES, name);
    }
}
