package my.thienph.tool.checkazv2.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSimple {

    public static final String dd = "dd";
    public static final String M = "m";
    public static final String yyyy = "yyyy";
    public static final String hh = "hh";
    public static final String mm = "mm";
    public static final String ss = "ss";

    public static final String PATTERN_DEFAULT = "dd-M-yyyy hh:mm:ss";
    public static final String PATTERN_CODE_FULL = "ddMyyyyhhmmss";
    public static final String PATTERN_CODE_DATE = "ddMyyyy";
    public static final String PATTERN_CODE_TIME = "hhmmss";

    private long time = -1;
    private String pattern = null;

    public DateSimple() {

    }

    public DateSimple(int time) {
        this.time = time * 1000;
    }

    public DateSimple(long time) {
        this.time = time;
    }

    public DateSimple(String pattern) {
        this.pattern = pattern;
    }

    public DateSimple(long time, String pattern) {
        this.time = time;
        this.pattern = pattern;
    }

    public DateSimple(int time, String pattern) {
        this.time = time * 1000;
        this.pattern = pattern;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setTime(int time) {
        this.time = time * 1000;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String get() {
        Date date = new Date();
        if (time > -1) {
            date.setTime(time);
        }
        if (pattern == null) {
            pattern = PATTERN_DEFAULT;
        }
        return new SimpleDateFormat(pattern).format(date);
    }
}
