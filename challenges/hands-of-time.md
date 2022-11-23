# Hands of Time

Given a clock time in hh:mm format, determine, to the nearest degree, the angle between the hour and the minute hands.

## Business Rules/Errata

- Your solution will take in a single LocalTime value as input and must return the angle of degrees as a integer value.
- Assume that the hour hand is in an absolute position (like on a basic face clock on the wall).

## Examples

```
clock_time = 3:00PM; //1500 in military time
hands_of_time(15:00)  // 90

clock_time = 12:00AM; //0000 in military time
hands_of_time(00:00)  // 0
```

## Tackling This Challenge
1. Create a solution file called 'mob.java' file and make the `hands_of_time` function work as expected.
2. Create some unit test to see if your solution passes those tests.

## Requirements

- JDK 11+
