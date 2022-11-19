package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int numberOfStations = 10;
    private int maxStationNumber;


    public Radio() {
            maxStationNumber = numberOfStations - 1;
    }

    public Radio(int numberOfStation) {
        this.numberOfStations = numberOfStation;
        if (numberOfStations - 1 < 0)
            maxStationNumber = 0;
        else
            maxStationNumber = numberOfStations - 1;
    }

    public int setCurrentStation(int newStation) {
        if (newStation < 0 || newStation > maxStationNumber) {
            return currentStation;
        }
        currentStation = newStation;
        return currentStation;
    }

    public void nextStation() {
        currentStation = currentStation + 1;
        if (currentStation > maxStationNumber) {
            currentStation = 0;
        }
    }

    public void previousStation() {
        currentStation = currentStation - 1;
        if (currentStation < 0) {
            currentStation = maxStationNumber;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }
}
