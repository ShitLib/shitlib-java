package io.github.shitlib.java;

import org.junit.jupiter.api.Test;

import static io.github.shitlib.java.OhShit.*;
import static org.assertj.core.api.Assertions.*;


public class OhShitTest {

    private class MyClass {}

    @Test
    public void ohShitClass() {
        MyClass a = new MyClass();
        assertThat(ohShit(a)).isInstanceOf(MyClass.class).isEqualTo(a);
    }

    @Test
    public void ohShitNull() {
        MyClass a = null;
        assertThat(ohShit( a)).isNull();
    }

    @Test
    public void ohShitInteger() {
        assertThat(ohShit(1)).isInstanceOf(Integer.class).isEqualTo(1);
    }

    @Test
    public void ohShitByte() {
        assertThat(ohShit((byte) 1)).isInstanceOf(Byte.class).isEqualTo((byte) 1);
    }

    @Test
    public void ohShitLong() {
        assertThat(ohShit(1L)).isInstanceOf(Long.class).isEqualTo(1L);
    }

    @Test
    public void ohShitBoolean() {
        assertThat(ohShit(true)).isInstanceOf(Boolean.class).isEqualTo(true);
    }

    @Test
    public void ohShitString() {
        assertThat(ohShit("a string")).isInstanceOf(String.class).isEqualTo("a string");
    }

    @Test
    public void ohShitCharacter() {
        assertThat(ohShit('A')).isInstanceOf(Character.class).isEqualTo('A');
    }
}