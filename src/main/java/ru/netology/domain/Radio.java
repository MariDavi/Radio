package ru.netology.domain;

public class Radio {
    public int curChannel;
    public int curVolume;

    public int incChannel(int curChannel) {
        if (curChannel < 9) {
            curChannel = curChannel + 1;
        } else {
            curChannel = 0;
        }
        return curChannel;
    }

    public int decChannel(int curChannel) {
        if (curChannel > 0) {
            curChannel = curChannel - 1;
        } else {
            curChannel = 9;
        }
        return curChannel;
    }

    public int incVolume(int curVolume) {
        if (curVolume < 10) {
            curVolume = curVolume + 1;
        } else {
            curVolume = 10;
        }
        return curVolume;
    }

    public int decVolume(int curVolume) {
        if (curVolume > 0) {
            curVolume = curVolume - 1;
        } else {
            curVolume = 0;
        }
        return curVolume;
    }
}

