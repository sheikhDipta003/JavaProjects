package com.company;

interface TvRemote{
    void OnOff();
    void changeChannel();
    void ChangeVol();
}

interface SmartTvRemote extends TvRemote{
    void playYouTubeVideo();
    void music();
}

class Tv implements TvRemote{
    @Override
    public void changeChannel() {
        System.out.println("Inside ChangeChannel() method");
    }

    @Override
    public void ChangeVol() {
        System.out.println("Inside ChangeVol() method");
    }

    @Override
    public void OnOff() {
        System.out.println("Inside OnOff() method");
    }
}

public class Ques_6_7 {
    public static void main(String[] args) {
        Tv ob = new Tv();
        ob.changeChannel();
        ob.ChangeVol();
        ob.OnOff();
    }
}
