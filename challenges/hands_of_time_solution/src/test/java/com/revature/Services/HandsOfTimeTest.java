package com.revature.Services;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class HandsOfTimeTest {

    @Test
    public void testHandsOfTime1() {

        HandsOfTime handsOfTime = new HandsOfTime();
        //same position
        assertEquals(0, handsOfTime.getAngle(LocalTime.of(0, 0)));
    }


    @Test
    public void testHandsOfTime2() {
        HandsOfTime handsOfTime = new HandsOfTime();
        assertEquals(0, handsOfTime.getAngle(LocalTime.of(6, 30)));
    }

    @Test
    public void testHandsOfTime3() {
        HandsOfTime handsOfTime = new HandsOfTime();
        assertEquals(0, handsOfTime.getAngle(LocalTime.of(6, 30)));
    }

    @Test
    public void testHandsOfTime4() {
        HandsOfTime handsOfTime = new HandsOfTime();
        assertEquals(90, handsOfTime.getAngle(LocalTime.of(0, 15)));
    }
    @Test
    public void testHandsOfTime5() {
        HandsOfTime handsOfTime = new HandsOfTime();
//        assertEquals(90, handsOfTime.getAngle(LocalTime.of(0, 15)));
        assertEquals(6, handsOfTime.getAngle(LocalTime.of(3, 16)));

    }    @Test
    public void testHandsOfTime6() {
        HandsOfTime handsOfTime = new HandsOfTime();
        assertEquals(60, handsOfTime.getAngle(LocalTime.of(4, 30)));
    }

    @Test
    public void testHandsOfTime7() {
        HandsOfTime handsOfTime = new HandsOfTime();
        assertEquals(90, handsOfTime.getAngle(LocalTime.of(6, 15)));
    }

    @Test
    public void testHandsOfTime8() {
        HandsOfTime handsOfTime = new HandsOfTime();
        assertEquals(90, handsOfTime.getAngle(LocalTime.of(0, 15)));
    }

    @Test
    public void testHandsOfTime9() {
        HandsOfTime handsOfTime = new HandsOfTime();
        assertEquals(108, handsOfTime.getAngle(LocalTime.of(9, 27)));
    }

    @Test
    public void testHandsOfTime10() {
        HandsOfTime handsOfTime = new HandsOfTime();
        assertEquals(36, handsOfTime.getAngle(LocalTime.of(1, 59)));
    }

}