package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppcodeqlTest {

    @Test
    void testAdd() {
        App app = new Appcodeql();
        assertEquals(8, app.addcodeql(5, 3));
    }
}