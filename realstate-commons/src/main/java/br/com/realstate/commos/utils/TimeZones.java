package br.com.realstate.commos.utils;

import java.time.ZoneId;
import java.util.TimeZone;

public class TimeZones {
    private static final String AMERICA_SAO_PAULO = "America/Sao_Paulo";
    private static final String UTC = "UTC";

    public TimeZones() {
    }

    public static void setDefault() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }

    public static void setUTC() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static ZoneId getDefault() {
        return ZoneId.of("America/Sao_Paulo");
    }

    public static ZoneId getUtc() {
        return ZoneId.of("UTC");
    }
}
