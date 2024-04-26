package com.startapp.networkTest.data;

import com.startapp.j2;
import com.startapp.k2;
import com.startapp.networkTest.enums.TimeSources;
import java.io.Serializable;
import java.util.TimeZone;

/* compiled from: Sta */
public class TimeInfo implements Cloneable, Serializable {
    private static final long serialVersionUID = 3793653153982296400L;
    public long DeviceDriftMillis;
    public boolean IsSynced;
    public long MillisSinceLastSync;
    public TimeSources TimeSource = TimeSources.Unknown;
    public String TimestampDateTime = "";
    public long TimestampMillis;
    public double TimestampOffset;
    public String TimestampTableau = "";
    public transient int day;
    public transient int hour;
    public transient int millisecond;
    public transient int minute;
    public transient int month;
    public transient int second;
    public transient int year;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setMillis(long j10) {
        this.TimestampTableau = k2.b(j10);
        this.TimestampDateTime = k2.a(j10);
        this.TimestampOffset = (double) (((((float) TimeZone.getDefault().getOffset(j10)) / 1000.0f) / 60.0f) / 60.0f);
        this.TimestampMillis = j10;
        j2 c10 = k2.c(j10);
        this.year = c10.f10575a;
        this.month = c10.f10576b;
        this.day = c10.f10577c;
        this.hour = c10.f10578d;
        this.minute = c10.f10579e;
        this.second = c10.f10580f;
        this.millisecond = c10.f10581g;
    }
}
