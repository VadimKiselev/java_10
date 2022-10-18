package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio volume = new Radio();
    Radio station = new Radio();

    @Test
    public void shouldRadio() {
        Radio volume = new Radio();

        Radio volume2 = new Radio(15, 0, 100, true);

        Radio volume3 = new Radio(0, 0, 9);

    }

    @Test
    public void shouldIncreaseVolumeOutOfRangeMax() {

        volume.setIncreaseVolume(101);
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {

        volume.setIncreaseVolume(100);
        int expected = 100;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMin() {

        volume.setIncreaseVolume(0);
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOutOfRangeMin() {

        volume.setIncreaseVolume(-1);
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeInOfRange() {

        volume.setIncreaseVolume(5);
        int expected = 5;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStation() {

        station.setCurrentStation(5);
        int expected = 5;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationOutOfRangeMax() {

        station.setCurrentStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationOutOfRangeMin() {

        station.setCurrentStation(-1);
        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOneForward() {

        volume.setIncreaseVolume(100);
        volume.increaseVolumeByOneForward();
        int expected = 100;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOneForwardBonder() {

        volume.setIncreaseVolume(0);
        volume.increaseVolumeByOneForward();
        int expected = 1;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOneForwardBorderMin() {

        volume.setIncreaseVolume(-1);
        volume.increaseVolumeByOneForward();
        int expected = 1;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOneForwardBorderMax() {

        volume.setIncreaseVolume(100);
        volume.increaseVolumeByOneForward();
        int expected = 100;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOneForwardAverage() {

        volume.setIncreaseVolume(5);
        volume.increaseVolumeByOneForward();
        int expected = 6;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOneBack() {

        volume.setIncreaseVolume(1);
        volume.increaseVolumeByOneBack();
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOneBackBorderMax() {

        volume.setIncreaseVolume(100);
        volume.increaseVolumeByOneBack();
        int expected = 99;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOneBackBorderMin() {

        volume.setIncreaseVolume(0);
        volume.increaseVolumeByOneBack();
        int expected = 0;
        int actual = volume.getIncreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationByOneForward() {

        station.setCurrentStation(7);
        station.currentStationByOneForward();
        int expected = 8;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationByOneForwardBorderMin() {

        station.setCurrentStation(0);
        station.currentStationByOneForward();
        int expected = 1;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationByOneForwardBorderMax() {

        station.setCurrentStation(9);
        station.currentStationByOneForward();
        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationByOneBack() {

        station.setCurrentStation(7);
        station.currentStationByOneBack();
        int expected = 6;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationByOneBackBorderMax() {

        station.setCurrentStation(9);
        station.currentStationByOneBack();
        int expected = 8;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationByOneBackBorderMin() {

        station.setCurrentStation(0);
        station.currentStationByOneBack();
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

}