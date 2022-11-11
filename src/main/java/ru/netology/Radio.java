package ru.netology;
public class Radio {
    private String radioName;
    private int station;
    private int stationsQuantity = 9;
    private int stationMin = 0;
    private int volume;
    private int volumeMax = 100;


    public Radio() {
        setStationsQuantity(10);
    }

    public Radio(String radioName, int station) {
        this.radioName = radioName;
        setStationsQuantity(station);
    }


    public void setStationsQuantity(int stationsQuantity) {
        if (stationsQuantity < stationMin) {
            return;
        }
        this.stationsQuantity = stationsQuantity;
    }

    public void setStation(int station) {
        if (station > stationsQuantity) {
            return;
        }
        if (station < stationMin) {
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
        if (station == stationsQuantity) {
            station = stationMin;
            return;
        }
        station++;
    }

    public void switchStationDown() {
        if (station == stationMin) {
            station = stationsQuantity;
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

    public int getStationsQuantity() {
        return stationsQuantity;
    }
}