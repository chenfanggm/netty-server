/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.aquarae.netty.server;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        EchoServer classUnderTest = new EchoServer();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
