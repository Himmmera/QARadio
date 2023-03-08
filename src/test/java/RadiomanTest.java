package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    org.example.Radioman radio = new org.example.Radioman();


    @Test
    void shouldSetStation() {
        org.example.Radioman radio = new org.example.Radioman(20);
        radio.setCurrentStation(15);
        assertEquals(15, radio.getCurrentStation());
    }

    @Test
    void shouldSetStation20() {
        org.example.Radioman radio = new org.example.Radioman(20);
        radio.setCurrentStation(20);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldChangeStation() {
        org.example.Radioman radio = new org.example.Radioman();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationUnderMinStation() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationOverMaxStation() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentStation(6);
        radio.nextStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void shouldOverMaxStation1() {
        org.example.Radioman radio = new org.example.Radioman(10);
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldOverMaxStation2() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentStation(4);
        radio.previousStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void shouldBelowMinStation1() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldBelowMinStation2() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentStation(-1);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldBelowMinStation3() {
        org.example.Radioman radio = new org.example.Radioman(20);
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(19, radio.getCurrentStation());
    }

    @Test
    void shouldChangeVolume() {
        org.example.Radioman radio = new org.example.Radioman();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume1() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume2() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume3() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolume1() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolume2() {
        org.example.Radioman radio = new org.example.Radioman();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}