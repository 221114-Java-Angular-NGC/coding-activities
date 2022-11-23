package com.revature.MainDriver;

import com.revature.Services.HandsOfTime;

import java.time.LocalTime;

public class MainDriver {

    public static void main(String[] args) {

        HandsOfTime handsOfTime = new HandsOfTime();

        LocalTime time1 = LocalTime.parse("15:00");
        LocalTime time2 = LocalTime.parse("12:00");
        LocalTime time3 = LocalTime.parse("13:30");
        LocalTime time4 = LocalTime.parse("05:00");

//        int result = handsOfTime.getAngle(time1);
//        int result = handsOfTime.getAngle(time2);
//        int result = handsOfTime.getAngle(time3);
        int result = handsOfTime.getAngle(time4);

        System.out.println(result);
    }

}
