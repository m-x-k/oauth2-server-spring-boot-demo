package com.mxk.oauth.server.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingTest {

    @Test
    public void testGreeting() throws Exception {
        Greeting greeting = new Greeting();
        greeting.setContent("content");
        greeting.setId(1234);

        assertEquals(1234, greeting.getId());
        assertEquals("content", greeting.getContent());
    }
}