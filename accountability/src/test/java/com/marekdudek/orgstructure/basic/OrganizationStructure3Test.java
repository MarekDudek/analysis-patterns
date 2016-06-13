package com.marekdudek.orgstructure.basic;

import org.junit.Test;

public class OrganizationStructure3Test {

    @Test
    public void test() {

        final OperatingUnit3 us          = new OperatingUnit3("United States");
        final Region3        northeast   = new Region3(us, "Northeast");
        final Division3      newEngland  = new Division3(northeast, "New England");
        final SalesOffice3   connecticut = new SalesOffice3(newEngland, "Connecticut");

        System.out.println(us);
    }
}
