package ru.netology.domain;

public class RadioAdvanced {
    private int curChannel;
    private int curVolume;

    public int setCurChannel(int newChannel) {

        if (newChannel >= 0 && newChannel < 10) {
            curChannel = newChannel;
        } else {
            curChannel = 0; //необходимо получить текущую станцию через геттер, но этого нет в условии задачи
        }

        return curChannel;
    }
}
