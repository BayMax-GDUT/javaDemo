package com.demo.Utils;

public enum WeekdaysEnum {

    SUNDAY(0, "星期天"),
    MONDAY(1, "星期一"),
    TUESDAY(2, "星期二"),
    WEDNESDAY(3, "星期三"),
    THURSDAY(4, "星期四"),
    FRIDAY(5, "星期五"),
    SATURDAY(6, "星期六");

    private Integer day;

    private String name;

    WeekdaysEnum(Integer day, String name) {
        this.day = day;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Integer getDay() {
        return day;
    }

    public static WeekdaysEnum getEnum(Integer day) {
        WeekdaysEnum[] enums = WeekdaysEnum.values();
        for (WeekdaysEnum anEnum : enums) {
            if (anEnum.day.equals(day)) {
                return anEnum;
            }
        }
        return null;
    }
    public static WeekdaysEnum getEnum(String name) {
        WeekdaysEnum[] enums = WeekdaysEnum.values();
        for (WeekdaysEnum anEnum : enums) {
            if (anEnum.name.equals(name)) {
                return anEnum;
            }
        }
        return null;
    }
}
