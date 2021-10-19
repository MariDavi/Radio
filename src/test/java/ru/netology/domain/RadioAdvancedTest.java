package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.RadioAdvanced;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {
    @Test
    public void shouldSetChannel1() {
        RadioAdvanced radio = new RadioAdvanced();
        int newChannel = 1;
        int actual = radio.setCurChannel(newChannel);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannel15() {
        RadioAdvanced radio = new RadioAdvanced();
        int newChannel = 15;
        int actual = radio.setCurChannel(newChannel);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannel0() {
        RadioAdvanced radio = new RadioAdvanced();
        int newChannel = 0;
        int actual = radio.setCurChannel(newChannel);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetChannelMinus3() {
        RadioAdvanced radio = new RadioAdvanced();
        int newChannel = -3;
        int actual = radio.setCurChannel(newChannel);
        int expected = 0;
        assertEquals(expected, actual);
    }


}