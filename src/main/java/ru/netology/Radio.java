package ru.netology;

public class Radio {
    private int increaseVolume;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int minStation = 0;
    private int maxStation = 9;
    private boolean on;

    public Radio() {   }

    public Radio(int increaseVolume, int minVolume, int maxVolume, boolean on) {
        this.increaseVolume = increaseVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.on = on;
    }

    public Radio(int currentStation, int minStation, int maxStation) {
        this.currentStation = currentStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
    }

    public Radio(int increaseVolume, int currentStation) {
        this.increaseVolume = increaseVolume;
        this.currentStation = currentStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setIncreaseVolume(int increaseVolume) {
        if (increaseVolume > maxVolume) {
            return;
        }
        if (increaseVolume < minVolume) {
            return;
        }
        this.increaseVolume = increaseVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }

    public void currentStationByOneForward() {
        if (currentStation < maxStation) {
            setCurrentStation(currentStation + 1);
        }
    }

    public void currentStationByOneBack() {
        if (currentStation > minStation) {
            setCurrentStation(currentStation - 1);
        }
    }

    public void increaseVolumeByOneForward() {
        if (increaseVolume < maxVolume) {
            setIncreaseVolume(increaseVolume + 1);
        }
    }

    public void increaseVolumeByOneBack() {
        if (increaseVolume > minVolume) {
            setIncreaseVolume(increaseVolume - 1);
        }
    }

}