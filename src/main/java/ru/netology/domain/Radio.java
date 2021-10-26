package ru.netology.domain;

public class Radio {
    private int curChannel;
    private int curVolume;

    public int getCurChannel() {
        return curChannel;
    }

    public int getCurVolume() {
        return curVolume;
    }

    public void setCurChannel(int newCurChannel) {
        curChannel = newCurChannel;
    }

    public void setCurVolume(int newCurVolume) {
        curVolume = newCurVolume;
    }

    public int incChannel() {
        if (getCurChannel() < 9) {
            setCurChannel(getCurChannel() + 1);
        } else {
            setCurChannel(0);
        }
        return getCurChannel();
    }

    public int decChannel() {
        if (getCurChannel() > 0) {
            setCurChannel(getCurChannel() - 1);
        } else {
            setCurChannel(9);
        }
        return getCurChannel();
    }

    public int incVolume() {
        if (getCurVolume() < 10) {
            setCurVolume(getCurVolume() + 1);
        } else {
            setCurVolume(10);
        }
        return getCurVolume();
    }

    public int decVolume() {
        if (getCurVolume() > 0) {
            setCurVolume(getCurVolume() - 1);
        } else {
            setCurVolume(0);
        }
        return getCurVolume();
    }

    public int setNewChannel(int newChannel) {
        if (newChannel >= 0 && newChannel < 10) {
            setCurChannel(newChannel);
        }
        return getCurChannel();
    }

}

