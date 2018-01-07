package com.example.android.quakereport;

/**
 * Created by Oways on 05-Jan-18.
 */

public class Earthquake {
    Double magnitude;
    String place;
    long time;
    String Url;

    public Earthquake(Double magnitude, String place, long time, String url) {
        this.magnitude = magnitude;
        this.place = place;
        this.time = time;
        Url = url;
    }

    public String getUrl() {
        return Url;
    }

    public Earthquake(Double magnitude, String place, long time) {
        this.magnitude = magnitude;
        this.place = place;
        this.time = time;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public String getPlace() {
        return place;
    }

    public long getTime() {
        return time;
    }
}

