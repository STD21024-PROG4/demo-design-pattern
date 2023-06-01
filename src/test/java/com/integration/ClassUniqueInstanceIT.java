package com.integration;

import com.server.td1p1.model.ClassUniqueInstance;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ClassUniqueInstanceIT {
    @Test
    void test() {
        ClassUniqueInstance instance1 = ClassUniqueInstance.getInstance();
        ClassUniqueInstance instance2 = ClassUniqueInstance.getInstance();
        instance1.setClick(1);
        assertEquals(1, instance1.getClick());
        assertEquals(1, instance2.getClick());
    }
}