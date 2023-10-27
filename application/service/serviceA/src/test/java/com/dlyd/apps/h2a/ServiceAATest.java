package com.dlyd.apps.h2a;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.dlyd.apps.h2a.demo.service.a.ServiceAA;

public class ServiceAATest {
    private final ServiceAA aa = new ServiceAA();
    @Test
    void testAdd() {
        assertEquals(13, aa.add(6, 7));
    }
}
