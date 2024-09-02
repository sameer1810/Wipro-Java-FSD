package com.sam.Aug27_NameApp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.sam.Aug27_NameApp.NameApp;

import java.io.ByteArrayInputStream;

public class NameAppTest {

    @Test
    public void testEnterName() {
        String simulatedInput = "Afshu Shaik\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        NameApp app = new NameApp();
        String name = app.enterName();

        assertEquals("Afshu Shaik", name);
    }
}
