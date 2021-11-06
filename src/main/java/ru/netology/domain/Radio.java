package ru.netology.domain;

public class Radio {
    private int curChannel = 0;
    private int curVolume = 0;
    private int maxChannel = 10;
    private int lastChannel;

    public Radio() {
    }

    public Radio(int curChannel, int curVolume, int maxChannel) {
        this.curChannel = curChannel;
        this.curVolume = curVolume;
        this.maxChannel = maxChannel;
        this.lastChannel = maxChannel -1;
    }

    public int getCurChannel() {
        return curChannel;
    }

    public int getCurVolume() {
        return curVolume;
    }

    public int getLastChannel() {
        return lastChannel;
    }

    public void setCurChannel(int newCurChannel) {
        curChannel = newCurChannel;
    }

    public void setCurVolume(int newCurVolume) {
        curVolume = newCurVolume;
    }

    public int incChannel() {
        if (getCurChannel() < lastChannel) {
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
            setCurChannel(lastChannel);
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
        if (newChannel >= 0 && newChannel <= lastChannel) {
            setCurChannel(newChannel);
        }
        return getCurChannel();
    }

}

