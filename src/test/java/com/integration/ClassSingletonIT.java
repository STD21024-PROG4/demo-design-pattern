package com.integration;

import com.server.td1p1.model.ClassSingleton;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClassSingletonIT {
    @Test
    void test() {
            ClassSingleton instance1 = ClassSingleton.getInstance();
            ClassSingleton instance2 = ClassSingleton.getInstance();
            instance1.setDescription("created");
            assertEquals("created", instance1.getDescription());
            assertEquals("created", instance2.getDescription());
        }
}
