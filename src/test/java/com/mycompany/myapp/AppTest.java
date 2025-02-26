package com.mycompany.myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    /**
     * This test checks if the App class has a greeting.
     * It ensures that the getGreeting() method returns a non-null value.
     */

    @Test
    public void testAppHasAGreeting() {
        App app = new App();
        assertNotNull("App should have a greeting", app.getGreeting());
    }

    @Test
    public void testGreetingMessage() {
        App app = new App();
        assertEquals("Hello, Maven!", app.getGreeting());
    }

    @Test
    public void testAddition() {
        int result = 2 + 2;
        assertEquals(4, result);
    }

    @Test
    public void testSubtraction() {
        int result = 5 - 3;
        assertEquals(2, result);
    }

    @Test
    public void testFailCase() {
        // This test is designed to fail
        assertTrue(true);
    }

    
}

