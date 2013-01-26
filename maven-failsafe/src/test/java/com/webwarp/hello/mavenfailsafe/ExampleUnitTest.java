package com.webwarp.hello.mavenfailsafe;

import org.testng.annotations.Test;
import static org.fest.assertions.Assertions.assertThat;

public class ExampleUnitTest {

    @Test
    public void shouldPass() {
        assertThat(false).isFalse();
    }
}