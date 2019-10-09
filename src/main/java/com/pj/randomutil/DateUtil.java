package com.pj.randomutil;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil
{
    public static void main(String[] args)
    {
        getEasternTimeZoneDate();
    }
    public static LocalDate getEasternTimeZoneDate()
    {
        OffsetDateTime offsetDateTime=OffsetDateTime.ofInstant(Instant.now(), ZoneId.of("America/New_York"));
        ZonedDateTime zonedDateTime=ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("America/New_York"));

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM/dd/YYYY");
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("MM/dd/YYYY");

        System.out.println("simpleDateFormat zonedDateTime date: "+zonedDateTime.format(dateTimeFormatter));
        System.out.println("Instant : "+Instant.now());
        System.out.println("Instant Date: "+Date.from(Instant.now()));

        System.out.println("EDT offsetDateTime.toLocalDate : "+offsetDateTime.toLocalDate());
        return offsetDateTime.toLocalDate();
    }
}