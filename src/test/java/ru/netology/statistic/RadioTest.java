package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void next() {
        Radio radio = new Radio();
        int expected = 1;

        radio.next();

        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    void nextMax() {
        Radio radio = new Radio();
        int expected = 0;

        radio.setCurrentStationNumber(9);
        radio.next();

        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    void prevMin() {
        Radio radio = new Radio();
        int expected = 9;

        radio.setCurrentStationNumber(0);
        radio.prev();

        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    void prev() {
        Radio radio = new Radio();
        int expected = 2;

        radio.setCurrentStationNumber(3);
        radio.prev();

        assertEquals(expected, radio.getCurrentStationNumber());
    }



    @Test
    void plusVolume() {
        Radio radio = new Radio();
        int expected = 10;

        radio.setSoundVolume(9);
        radio.plusVolume();

        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void plusVolumeMax() {
        Radio radio = new Radio();
        int expected = 10;

        radio.setSoundVolume(10);
        radio.plusVolume();

        assertEquals(expected, radio.getSoundVolume());
    }


    @Test
    void minusVolume() {
        Radio radio = new Radio();
        int expected = 1;

        radio.setSoundVolume(2);
        radio.minusVolume();

        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void minusVolumeMin() {
        Radio radio = new Radio();
        int expected = 0;

        radio.setSoundVolume(0);
        radio.minusVolume();

        assertEquals(expected, radio.getSoundVolume());
    }
}
