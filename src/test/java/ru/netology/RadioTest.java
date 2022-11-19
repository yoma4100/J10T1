package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {


    @ParameterizedTest
    @CsvFileSource(resources = "/shouldSetStation.csv")
    public void shouldSetStation(int newStation, int expected) {
        Radio service = new Radio();
        int actual = service.setCurrentStation(newStation);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/shouldSwitchNextStation.csv")
    public void shouldSwitchNextStation(int newStation, int expected) {
        Radio service = new Radio();

        int setCurrentStation = service.setCurrentStation(newStation);

        service.nextStation();

        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/shouldSwitchPreviousStation.csv")
    public void shouldSwitchPreviousStation(int newStation, int expected) {
        Radio service = new Radio();
        int setCurrentStation = service.setCurrentStation(newStation);

        service.previousStation();

        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/shouldIncreaseVolumeSource.csv")
    public void shouldIncreaseVolume(int iteration, int expected) {
        Radio service = new Radio();
        for (int i = 0; i < iteration; i++) {
            service.increaseVolume();
        }

        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/shouldDecreaseVolumeSource.csv")
    public void shouldDecreaseVolume(int iteration, int expected) {
        Radio service = new Radio();
        for (int i = 0; i < iteration; i++) {
            service.increaseVolume();
        }

        service.decreaseVolume();

        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}