package org.example;

import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class MainTest {

    @Test
    public void testSum(){
        int sum = 4;
        Assertions.assertEquals(4,sum);
    }


}
