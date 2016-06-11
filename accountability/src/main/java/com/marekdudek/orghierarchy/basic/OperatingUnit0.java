package com.marekdudek.orghierarchy.basic;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;

@Getter
@ToString
class OperatingUnit0 implements Acceptor0 {

    private String name;
    private final Collection<Region0> subsidiaries = new ArrayList<>();

    OperatingUnit0(final String name) {
        this.name = name;
    }

    @Override
    public void accept(final Visitor0 visitor) {
        visitor.visit(this);
        subsidiaries.forEach(r -> r.accept(visitor));
    }
}
