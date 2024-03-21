package com.OOP;

public class MyTime implements BaseTime {

    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toStringValues() {        // hour: 0->23; minute: 0->59; second: 0->59

        if (this.hour>=24){
            setHour(this.hour-24);
        } else if (this.minute>=60){
            if (hour==23 && minute==60 && second==0){
                setHour(0);
                setMinute(this.minute-60);
            }
            if (minute==60){
                setHour(this.hour + 1);
                setMinute(this.minute-60);
            }
            if (minute==60){
                setMinute(this.minute-60);
            }
        } else if (this.second>=60){
            if (hour==23 && minute==59 && second==60){
                setHour(0);
                setMinute(0);
            }
            if (minute==59 && second==60){
                setHour(this.hour+1);
                setMinute(this.minute-59);
            } else {
                setMinute(this.minute+1);
            }
            setSecond(this.second-60);
        }


        if (this.hour<0){
            setHour(this.hour+24);
        } else if (this.minute<0){
            if (hour==0){
                setHour(this.hour+23);
            } else {
                setHour(this.hour-1);
            }
            setMinute(this.minute+60);
        } else if (this.second<0){
            if (hour==0 && minute==0 && second==-1){
                setHour(this.hour+23);
                setMinute(this.minute+59);
            }
            if (second==-1 && minute != 0){
                setMinute(this.minute-1);
            } else if (minute==0){
                setHour(this.hour-1);
                setMinute(this.minute+59);
            }
            if (second==-1){
                setSecond(this.second+60);
            }
        }

        String hour = "";
        String minute = "";
        String second = "";

        if (this.hour<10){
            hour = "0" + this.hour;
        } else {
            hour = this.hour + "";
        }

        if (this.minute<10){
            minute = "0" + this.minute;
        } else {
            minute = this.minute + "";
        }

        if (this.second < 10){
            second = "0" + this.second;
        } else {
            second = this.second + "";
        }
        return hour + ":" + minute + ":" + second;
    }

    @Override
    public MyTime nextSecond() {
        return new MyTime(hour, minute, (second +1));
    }

    @Override
    public MyTime nextMinute() {
        return new MyTime(hour, (minute + 1), second);
    }

    @Override
    public MyTime nextHour() {
        return new MyTime((hour + 1), minute, second);
    }

    @Override
    public MyTime previousSecond() {
        return new MyTime(hour, minute, (second-1));
    }

    @Override
    public MyTime previousMinute() {
        return new MyTime(hour, (minute-1), second);
    }

    @Override
    public MyTime previousHour() {
        return new MyTime((hour-1), minute, second);
    }
}
