package com.marekdudek.orgstructure.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Organization3 {

    private String name;
    private Map<OrganizationStructureType3, OrganizationStructure3>      parents      = new HashMap<>();
    private Map<OrganizationStructureType3, Set<OrganizationStructure3>> subsidiaries = new HashMap<>();

    public Organization3(final Organization3 parent, final OrganizationStructureType3 type, final String n) {
        name = n;
        if (parent != null) {
            parents.put(type, new OrganizationStructure3(parent, type));
            final Set<OrganizationStructure3> subs = parent.subsidiaries.get(type);
            if (subs == null)
                parent.subsidiaries.put(type, new HashSet<>());
            parent.subsidiaries.get(type).add(new OrganizationStructure3(this, type));
        }
    }
}
