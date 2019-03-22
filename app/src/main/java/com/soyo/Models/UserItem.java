package com.soyo.Models;

public class UserItem {
    String name;
    String city;
    String phone;
    int days;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public UserItem(String name, String city, String phone, int days) {
        this.name = name;
        this.city = city;
        this.phone = phone;
        this.days = days;
    }
}
