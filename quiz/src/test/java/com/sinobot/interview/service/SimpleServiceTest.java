/*
 * Simple Java Quiz for play. Have fun!
 *
 * Name:
 */
package com.sinobot.interview.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SimpleService.class)
public class SimpleServiceTest {

    @Autowired
    private SimpleService service;

    @Test
    public void canFillGapSuccess() {
        assertTrue(service.canFillGap(3, 1, 9));
        assertFalse(service.canFillGap(4, 1, 8));
        assertTrue(service.canFillGap(3, 2, 10));
    }

    @Test
    public void lengthEncodeSuccess() {
        var input = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW";
        assertEquals("12W1B12W3B24W1B14W", service.lengthEncode(input));
    }

    @Test
    public void reverseSuccess() {
        assertEquals(8845671, service.reverse(1765488));
    }

}
