package com.pj.randomutil;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateUtil
{
    public static void main(String[] args)
    {
        getEasternTimeZoneDate();
    }
    private static void getEasternTimeZoneDate()
    {
        ZonedDateTime zonedDateTime=ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("America/New_York"));
        System.out.println("offsetDateTime.toInstant(): "+zonedDateTime.toInstant());

        System.out.println("EDT offsetDateTime.toLocalDateTime : "+zonedDateTime.toLocalDateTime());
        System.out.println("EDT LocalDateTime.now() : "+LocalDateTime.now());
    }
}
