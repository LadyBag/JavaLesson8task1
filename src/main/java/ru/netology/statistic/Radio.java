package ru.netology.statistic;

public class Radio {
    private int currentStationNumber;
    private int soundVolume;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int minStationNumber = 0;
    private int maxStationNumber = 9;


    public void next() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
        } else {
            currentStationNumber = currentStationNumber + 1;
        }
    }

    public void prev() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        this.currentStationNumber = currentStationNumber;
    }

    public void plusVolume() {
        if (soundVolume != maxVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void minusVolume() {
        if (soundVolume != minVolume) {
            soundVolume = soundVolume - 1;
        }
    }
}
