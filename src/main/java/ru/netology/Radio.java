package ru.netology;

public class Radio {
    int currentVolume;
    int currentStation;

    public int setCurrentStation(int newStation) {
        if ((newStation < 0) || (newStation > 9)) {
            return currentStation;
        }
        currentStation = newStation;
        return currentStation;
    }

    public void nextStation() {
        currentStation = currentStation + 1;
        if (currentStation > 9) {
            currentStation = 0;
        }
    }

    public void previousStation() {
        currentStation = currentStation - 1;
        if (currentStation < 0) {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= 10) {
            currentVolume = 10;
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
