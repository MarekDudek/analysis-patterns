package com.marekdudek.orghierarchy.basic;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;

@Getter
@ToString(exclude = "parent")
class Division0 implements Acceptor0 {

    private String  name;
    private Region0 parent;
    private final Collection<SalesOffice0> subsidiaries = new ArrayList<>();

    Division0(final Region0 region, final String name) {
        this.name = name;
        parent = region;
        parent.getSubsidiaries().add(this);
    }

    @Override
    public void accept(final Visitor0 visitor) {
        visitor.visit(this);
        subsidiaries.forEach(o -> o.accept(visitor));
    }
}
