package com.lzy.commonTest;

import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.lang.String;

/**
 * Created By Lizhengyuan on 18-9-26
 */
public class TimeTest {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.getYear() + "-" + localDate.getMonthValue() + "-" + localDate.getDayOfMonth());

        System.out.println(localDate.getDayOfYear());

        LocalDate birthday = LocalDate.of(2009, 3, 3);
        System.out.println(birthday);

        System.out.println(localDate.equals(birthday));

        MonthDay from = MonthDay.of(birthday.getMonth(), birthday.getDayOfMonth());
        MonthDay now = MonthDay.now();
        if (!now.equals(from)) {
            System.out.println("今天不是生日！");
        }

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
        LocalTime now2 = now1.plusHours(2);
        System.out.println(now2);

        LocalDate oneWeek = localDate.plus(1, ChronoUnit.WEEKS);
        System.out.println("一周后的时间时：" + oneWeek);

        LocalDate oneYear = localDate.minus(1, ChronoUnit.YEARS);
        System.out.println("一年前的时间是：" + oneYear);

        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());


        System.out.println(ZonedDateTime.now());

        YearMonth currentYearMonth = YearMonth.now();
        System.out.println("今年的这个月有" + currentYearMonth.lengthOfMonth());
        YearMonth dateYear = YearMonth.of(2018, Month.FEBRUARY);
        System.out.println("你输入的日期是："+dateYear);

        System.out.println("今年是否未闰年"+localDate.isLeapYear());

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2012, Month.FEBRUARY, 3);
        Period period = Period.between(d1,d2);
        System.out.println( "日期%s和日期%s相差%s个月"+period.getMonths() );

        Instant instant = Instant.now();
        System.out.println("当前时间是："+instant);
        java.util.Date from1 = Date.from(instant);
        from1.toInstant();

        String dateStr = "20180920";
        LocalDate resDate = LocalDate.parse(dateStr,DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("您输入的时间是："+resDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("格式化后的时间是："+localDateTime.format(dateTimeFormatter));


    }

}
