package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldIncChannel9() {
        Radio radio = new Radio();
        int curChannel = 9;
        int actual = radio.incChannel(curChannel);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncChannel3() {
        Radio radio = new Radio();
        int curChannel = 3;
        int actual = radio.incChannel(curChannel);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecChannel0() {
        Radio radio = new Radio();
        int curChannel = 0;
        int actual = radio.decChannel(curChannel);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecChannel5() {
        Radio radio = new Radio();
        int curChannel = 5;
        int actual = radio.decChannel(curChannel);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncVolume10() {
        Radio radio = new Radio();
        int curVolume = 10;
        int actual = radio.incVolume(curVolume);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncVolume5() {
        Radio radio = new Radio();
        int curVolume = 5;
        int actual = radio.incVolume(curVolume);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecVolume0() {
        Radio radio = new Radio();
        int curVolume = 0;
        int actual = radio.decVolume(curVolume);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecVolume3() {
        Radio radio = new Radio();
        int curVolume = 3;
        int actual = radio.decVolume(curVolume);
        int expected = 2;
        assertEquals(expected, actual);
    }





}