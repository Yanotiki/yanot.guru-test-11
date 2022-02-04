package qa.guru.yanot;

import org.junit.jupiter.api.Test;

import static java.lang.String.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    void powTest() {
        assertEquals(valueOf(8.0), valueOf(Math.pow(2, 3)));
    }
}
