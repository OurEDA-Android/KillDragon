package com.example.means88.test;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 1);
    }

    @Test
    public void testString() {
        String a = "a";
        String b = "ab";
        b = b.substring(0, 0);
        assertSame(a, b);
    }
/*
    @Test
    public void testMessage() throws JSONException {
        Message excepted = new Message(0, "success");
        Message actual = DataManager.getMsg(DataManager.getSuccessCase());
        assertEquals(excepted, actual);
        assertSame(excepted, actual);
    }

    @Test
    public void testDouble() {
        assertEquals(0.51f, 1.0/2, 1e-8);
        assertEquals(0.51f, 1.0/2, 0.1f);
    }
*/
    @Test(timeout = 1000)
    public void testTimeout() {
        assertEquals(1, 1);
        while(true);
    }

    @Test(expected = JSONException.class)
    public void testException() throws JSONException {
        //DataManager.getMsg("[]");
    }

}