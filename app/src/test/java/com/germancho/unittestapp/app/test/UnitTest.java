package com.germancho.unittestapp.app.test;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Created by gbravo on 8/18/14.
 */

@RunWith(RobolectricGradleTestRunner.class)
public class UnitTest {

    @Test
    public void testFail() {
        assertTrue(true);
    }

}
