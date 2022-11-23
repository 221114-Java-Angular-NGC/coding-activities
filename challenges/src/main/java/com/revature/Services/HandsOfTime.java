package com.revature.Services;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HandsOfTime {

    Logger logger = LoggerFactory.getLogger(HandsOfTime.class);

    //1. retrieve the time and split it up into two integer
    // values by using localtime.gethour() and localtime
    // .getminute() for hour nd minute
    //2. use the equation (h/12*360) - (m/60*360)

    public int getAngle(LocalTime time) {

        //logging time argument
        logger.info("This is the time given: " + time);

        int hour = time.getHour() % 12;
        logger.info("This is the hour given: " + hour);
        int minute = time.getMinute();
        logger.info("This is the time given: " + minute);
        int hourAngle = hour * 30;
        logger.info("This is the angle: " + hourAngle);
        int minuteAngle = minute * 6;
        logger.info("This is the angle: " + minuteAngle);


        int angle = Math.abs(hourAngle - minuteAngle);
        logger.info("Calculated angle " + angle);

        if (angle > 180) {
            logger.info("Angle was greater than 180");
            angle = 360 - angle;
        }
        return angle;

    }

}
