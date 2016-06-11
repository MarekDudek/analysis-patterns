package com.marekdudek.orghierarchy.basic;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(exclude = "parent")
class SalesOffice0 implements Acceptor0 {

    private String    name;
    private Division0 parent;

    SalesOffice0(final Division0 division, final String name) {
        this.name = name;
        parent = division;
        parent.getSubsidiaries().add(this);
    }

    @Override
    public void accept(final Visitor0 visitor) {
        visitor.visit(this);
    }
}
