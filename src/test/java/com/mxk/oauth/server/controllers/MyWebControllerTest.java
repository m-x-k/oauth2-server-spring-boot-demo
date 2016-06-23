package com.mxk.oauth.server.controllers;

import com.mxk.oauth.server.model.Greeting;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MyWebControllerTest {

    private MyWebController myWebController;

    @Before
    public void setUp() throws Exception {
        myWebController = new MyWebController();
    }

    @Test
    public void testGreetingForm() throws Exception {
        Model model = mock(Model.class);
        String page = myWebController.greetingForm(model);
        assertEquals("greeting", page);
        verify(model).addAttribute(eq("greeting"), anyObject());
    }

    @Test
    public void testGreetingSubmit() throws Exception {
        Model model = mock(Model.class);
        Greeting greeting = new Greeting();
        String page = myWebController.greetingSubmit(greeting, model);
        assertEquals("result", page);
        verify(model).addAttribute("greeting", greeting);
    }
}