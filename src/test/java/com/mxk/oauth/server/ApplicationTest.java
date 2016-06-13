package com.mxk.oauth.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.SpringApplication;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest(SpringApplication.class)
public class ApplicationTest {

    /*
     * Empty test for future
     */
    @Test
    public void testApplication() {
        new Application();
    }

    @Test
    public void testMain() throws Exception {
        String[] args = {};
        PowerMockito.mockStatic(SpringApplication.class);

        Application.main(args);

        verifyStatic(times(1));
    }
}