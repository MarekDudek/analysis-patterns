package com.marekdudek.orghierarchy.basic;

interface Visitor0 {

    // has to have a method for every level

    void visit(OperatingUnit0 unit);

    void visit(Region0 region);

    void visit(Division0 division);

    void visit(SalesOffice0 salesOffice);
}
