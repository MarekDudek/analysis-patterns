package com.marekdudek.orghierarchy.basic;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;

@Getter
@ToString(exclude = "parent")
class Region0 implements Acceptor0 {

    private String         name;
    private OperatingUnit0 parent;
    private final Collection<Division0> subsidiaries = new ArrayList<>();

    Region0(final OperatingUnit0 unit, final String name) {
        this.name = name;
        parent = unit;
        parent.getSubsidiaries().add(this);
    }

    @Override
    public void accept(final Visitor0 visitor) {
        visitor.visit(this);
        subsidiaries.forEach(d -> d.accept(visitor));
    }
}
