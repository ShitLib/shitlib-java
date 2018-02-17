package com.github.shitlib.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.github.shitlib.java.OhShit.*;
import static org.assertj.core.api.Assertions.*;



public class OhShitTest {

    private class MyClass {}

    @Test
    public void ohShitClass() {
        MyClass a = new MyClass();
        assertThat(ohShit(a)).isInstanceOf(MyClass.class).isEqualTo(a);
    }

    @Test
    public void ohShitInteger1() {
        //TODO:
        assertTrue(true);
    }

    @Test
    public void ohShit2() {
        //TODO:
        assertTrue(true);
    }

    @Test
    public void ohShit3() {
        //TODO:
        assertTrue(true);
    }

    @Test
    public void ohShit4() {
        //TODO:
        assertTrue(true);
    }

    @Test
    public void ohShit5() {
        //TODO:
        assertTrue(true);
    }
}