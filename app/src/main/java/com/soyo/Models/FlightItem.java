package com.soyo.Models;

public class FlightItem {
    String name;
    String deptime;
    String arvltime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptime() {
        return deptime;
    }

    public void setDeptime(String deptime) {
        this.deptime = deptime;
    }

    public String getArvltime() {
        return arvltime;
    }

    public void setArvltime(String arvltime) {
        this.arvltime = arvltime;
    }

    public FlightItem(String name, String deptime, String arvltime) {
        this.name = name;
        this.deptime = deptime;
        this.arvltime = arvltime;
    }
}
