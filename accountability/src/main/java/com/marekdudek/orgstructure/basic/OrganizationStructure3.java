package com.marekdudek.orgstructure.basic;

public class OrganizationStructure3 {

    private final Organization3 parent;
    private final Organization3 subsidiary;

    private final OrganizationStructureType3 type;

    public OrganizationStructure3(final Organization3 parent, final Organization3 subsidiary, final OrganizationStructureType3 type) {
        this.parent = parent;
        this.subsidiary = subsidiary;
        this.type = type;
    }

    public Organization3 getParent() {
        return parent;
    }

    public Organization3 getSubsidiary() {
        return subsidiary;
    }
}
