package com.github.shitlib.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.github.shitlib.java.OhShit.*;
import static org.assertj.core.api.Assertions.*;



public class OhShitTest {

    private class MyClass {}

    @Test
    public void ohShit_Class() {
        MyClass a = new MyClass();
        assertThat(ohShit(a)).isInstanceOf(MyClass.class).isEqualTo(a);
    }

    @Test
    public void ohShit_Integer_1() {
        //TODO:
    }

    @Test
    public void ohShit2() {
        //TODO:
    }

    @Test
    public void ohShit3() {
        //TODO:
    }

    @Test
    public void ohShit4() {
        //TODO:
    }

    @Test
    public void ohShit5() {
        //TODO:
    }
}