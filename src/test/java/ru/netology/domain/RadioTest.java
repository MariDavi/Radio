package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    Radio JococoRadio = new Radio(); // Creating object for Jococo 100% coverage

    Radio radio = new Radio(0,0,10);

    @Test
    public void shouldIncChannelInMax() {
        radio.setNewChannel(radio.getMaxChannel());
        int actual = radio.incChannel();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncChannel3() {
        radio.setCurChannel(3);
        int actual = radio.incChannel();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecChannelInMin() {
        radio.setCurChannel(0);
        int actual = radio.decChannel();
        int expected = radio.getMaxChannel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecChannel5() {
        radio.setCurChannel(5);
        int actual = radio.decChannel();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncVolumeInMax() {
        radio.setCurVolume(10);
        int actual = radio.incVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncVolume5() {
        radio.setCurVolume(5);
        int actual = radio.incVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecVolumeInMin() {
        radio.setCurVolume(0);
        int actual = radio.decVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecVolume3() {
        radio.setCurVolume(3);
        int actual = radio.decVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewChannel1() {
        int actual = radio.setNewChannel(1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannel15() {
        radio.setNewChannel(1);
        int actual = radio.setNewChannel(15);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelMinus3() {
        radio.setCurChannel(1);
        int actual = radio.setNewChannel(-1);
        int expected = 1;
        assertEquals(expected, actual);
    }
}