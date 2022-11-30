package com.revature.util;

import java.util.Calendar;
import java.util.Date;

public class HoroscopeUtil {

	public static String findZodiac(Date date) {
		String zodiac = null;
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		switch (month) {
		case 0:
			if (day < 20) {
				zodiac = "Capricorn";
			} else {
				zodiac = "Aquarius";
			}
			break;
		case 1:
			if (day < 19) {
				zodiac = "Aquarius";
			} else {
				zodiac = "Pisces";
			}
			break;
		case 2:
			if (day < 21) {
				zodiac = "Pisces";
			} else {
				zodiac = "Aries";
			}
			break;
		case 3:
			if (day < 20) {
				zodiac = "Aries";
			} else {
				zodiac = "Taurus";
			}
			break;
		case 4:
			if (day < 21) {
				zodiac = "Taurus";
			} else {
				zodiac = "Gemini";
			}
			break;
		case 5:
			if (day < 21) {
				zodiac = "Gemini";
			} else {
				zodiac = "Cancer";
			}
			break;
		case 6:
			if (day < 23) {
				zodiac = "Cancer";
			} else {
				zodiac = "Leo";
			}
			break;
		case 7:
			if (day < 23) {
				zodiac = "Leo";
			} else {
				zodiac = "Virgo";
			}
			break;
		case 8:
			if (day < 23) {
				zodiac = "Virgo";
			} else {
				zodiac = "Libra";
			}
			break;
		case 9:
			if (day < 23) {
				zodiac = "Libra";
			} else {
				zodiac = "Scorpio";
			}
			break;
		case 10:
			if (day < 22) {
				zodiac = "Scorpio";
			} else {
				zodiac = "Sagittarius";
			}
			break;
		case 11:
			if (day < 22) {
				zodiac = "Sagittarius";
			} else {
				zodiac = "Capricorn";
			}
			break;
		default:
			return zodiac;
		}

		return zodiac;
	};

}
