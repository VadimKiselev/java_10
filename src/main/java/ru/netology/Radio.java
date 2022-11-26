package ru.netology;

public class Radio {
    protected String radioName;
    protected int station;
    protected int volume;
    protected int volumeMax;
    protected int maxStation;
    protected int minStation;

    {
        minStation = 0;
        volumeMax = 100;
    }

    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int station) {
        this.maxStation = station - 1;
    }

    public Radio(String radioName, int station) {
        this.radioName = radioName;
        setMaxStation(station);
    }


    public void setMaxStation(int maxStation) {
        if (maxStation < minStation) {
            return;
        }
        this.maxStation = maxStation;
    }

    public void setStation(int station) {
        if (station > maxStation) {
            return;
        }
        if (station < minStation) {
            return;
        }
        this.station = station;
    }

    public void setVolume(int volume) {
        if (volume > volumeMax) {
            return;
        } else if (volume < 0) {
            return;
        }
        this.volume = volume;
    }


    public void switchStationUp() {
        if (station == maxStation) {
            station = minStation;
            return;
        }
        station++;
    }

    public void switchStationDown() {
        if (station == minStation) {
            station = maxStation;
            return;
        }
        station--;
    }


    public void increaseVolume() {
        if (volume == volumeMax) {
            return;
        }
        setVolume(++volume);
    }

    public void decreaseVolume() {
        if (volume == 0) {
            return;
        }
        setVolume(--volume);
    }


    public int getVolume() {
        return volume;
    }

    public int getStation() {
        return station;
    }

    public int getMaxStation() {
        return maxStation;
    }
}