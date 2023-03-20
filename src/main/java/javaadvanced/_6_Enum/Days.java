package javaadvanced._6_Enum;

public enum Days {
    MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false),
    FRIDAY(false), SATURDAY(true), SUNDAY(true);


    boolean isWeekend;

    Days(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
}

