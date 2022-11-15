package ru.netology;

public class Radio {
    public int currentVolume;
    public int currentStation;

    public void setCurrentStation(int newStation) {
        if (newStation >= 0 && newStation <= 9)
            currentStation = newStation;
    }

    public void nextStation() {
        if (currentStation > 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void previousStation() {
        if (currentStation < 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume > 10) {
            currentVolume = 10;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume < 0) {
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
