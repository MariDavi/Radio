package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldIncChannel9() {
        Radio radio = new Radio();
        int curChannel = 9;
        radio.setCurChannel(curChannel);
        int actual = radio.incChannel();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncChannel3() {
        Radio radio = new Radio();
        int curChannel = 3;
        radio.setCurChannel(curChannel);
        int actual = radio.incChannel();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecChannel0() {
        Radio radio = new Radio();
        int curChannel = 0;
        radio.setCurChannel(curChannel);
        int actual = radio.decChannel();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecChannel5() {
        Radio radio = new Radio();
        int curChannel = 5;
        radio.setCurChannel(curChannel);
        int actual = radio.decChannel();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncVolume10() {
        Radio radio = new Radio();
        int curVolume = 10;
        radio.setCurVolume(curVolume);
        int actual = radio.incVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncVolume5() {
        Radio radio = new Radio();
        int curVolume = 5;
        radio.setCurVolume(curVolume);
        int actual = radio.incVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecVolume0() {
        Radio radio = new Radio();
        int curVolume = 0;
        radio.setCurVolume(curVolume);
        int actual = radio.decVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecVolume3() {
        Radio radio = new Radio();
        int curVolume = 3;
        radio.setCurVolume(curVolume);
        int actual = radio.decVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewChannel1() {
        Radio radio = new Radio();
        radio.setCurChannel(1);
        int newChannel = 1;
        int actual = radio.setNewChannel(newChannel);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannel15() {
        Radio radio = new Radio();
        radio.setCurChannel(1);
        int newChannel = 15;
        int actual = radio.setNewChannel(newChannel);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannel0() {
        Radio radio = new Radio();
        radio.setCurChannel(1);
        int newChannel = 0;
        int actual = radio.setNewChannel(newChannel);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelMinus3() {
        Radio radio = new Radio();
        radio.setCurChannel(1);
        int newChannel = -3;
        int actual = radio.setNewChannel(newChannel);
        int expected = 1;
        assertEquals(expected, actual);
    }

}