package com.OOP;

public interface BaseTime {

    void setTime(int hour, int minute, int second);
    String toStringValues();
    MyTime nextSecond();
    MyTime nextMinute();
    MyTime nextHour();
    MyTime previousSecond();
    MyTime previousMinute();
    MyTime previousHour();


}
