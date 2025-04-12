package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertEquals("Hello World!", classUnderTest.getGreeting());
    }

    @Test
    void appRunsWithoutException() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
