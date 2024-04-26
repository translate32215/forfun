package com.startapp;

import android.content.Context;
import androidx.fragment.app.c;
import androidx.leanback.widget.s;
import com.startapp.networkTest.data.TimeInfo;
import java.util.TimeZone;
import q.b;

/* compiled from: Sta */
public class k2 {
    public static String a(long j10) {
        return a(j10, false);
    }

    public static String b(long j10) {
        return a(j10, true);
    }

    public static j2 c(long j10) {
        return a(j10, TimeZone.getDefault().getOffset(j10));
    }

    public static String a(Context context) {
        return b(ua.d());
    }

    public static String b(int i10, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        if (i10 < 10) {
            sb2.append("0");
        }
        sb2.append(i10);
        sb2.append("-");
        if (i11 < 10) {
            sb2.append("0");
        }
        sb2.append(i11);
        sb2.append("-");
        if (i12 < 10) {
            sb2.append("0");
        }
        sb2.append(i12);
        return sb2.toString();
    }

    private static String a(long j10, boolean z10) {
        j2 c10 = c(j10);
        return a(c10.f10575a, c10.f10576b, c10.f10577c, c10.f10578d, c10.f10579e, c10.f10580f, c10.f10581g, z10, c10.f10582h);
    }

    public static j2 a(long j10, int i10) {
        int i11;
        long j11 = ((long) i10) + j10;
        long j12 = j11 / 1000;
        int i12 = (int) (j11 % 1000);
        long j13 = j12 / 60;
        int i13 = (int) (j12 % 60);
        long j14 = j13 / 60;
        int i14 = (int) (j13 % 60);
        int i15 = (int) (j14 / 24);
        int i16 = (int) (j14 % 24);
        int i17 = 365;
        int i18 = 1;
        int i19 = 1970;
        int i20 = 0;
        boolean z10 = false;
        while (true) {
            i11 = i15 + 1;
            if (i17 >= i11) {
                break;
            }
            i19++;
            int i21 = i17 + 365;
            if ((i19 % 4 != 0 || i19 % 100 == 0) && i19 % 400 != 0) {
                z10 = false;
            } else {
                i21++;
                z10 = true;
            }
            int i22 = i21;
            i20 = i17;
            i17 = i22;
        }
        int i23 = i11 - i20;
        int i24 = 0;
        int i25 = 31;
        while (i25 < i23) {
            i18++;
            int i26 = i25;
            i25 = (!z10 || i18 != 2) ? i18 == 2 ? i25 + 28 : (i18 == 4 || i18 == 6 || i18 == 9 || i18 == 11) ? i25 + 30 : i25 + 31 : i25 + 29;
            i24 = i26;
        }
        return new j2(i19, i18, i23 - i24, i16, i14, i13, i12, i10);
    }

    public static String a(int i10, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append("-");
        if (i11 < 10) {
            sb2.append("0");
        }
        sb2.append(i11);
        sb2.append("-");
        if (i12 < 10) {
            sb2.append("0");
        }
        sb2.append(i12);
        return sb2.toString();
    }

    public static String a(int i10, int i11, int i12, int i13, int i14, int i15) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append("-");
        if (i11 < 10) {
            sb2.append("0");
        }
        sb2.append(i11);
        sb2.append("-");
        if (i12 < 10) {
            sb2.append("0");
        }
        sb2.append(i12);
        sb2.append("-");
        if (i13 < 10) {
            sb2.append("0");
        }
        sb2.append(i13);
        sb2.append("-");
        if (i14 < 10) {
            sb2.append("0");
        }
        sb2.append(i14);
        sb2.append("-");
        if (i15 < 10) {
            sb2.append("0");
        }
        sb2.append(i15);
        return sb2.toString();
    }

    public static String a(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        String a10 = a(i10, i11, i12, i13, i14, i15);
        String a11 = o2.a("", i16);
        if (i16 < 10) {
            a11 = o2.a("00", i16);
        } else if (i16 < 100) {
            a11 = o2.a("0", i16);
        }
        return b.a(a10, "-", a11);
    }

    public static String a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, int i17) {
        int i18 = i11;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        int i22 = i15;
        int i23 = i16;
        int i24 = i17;
        String a10 = o2.a("", i19);
        String a11 = o2.a("", i18);
        String a12 = o2.a("", i20);
        String a13 = o2.a("", i21);
        String a14 = o2.a("", i22);
        String a15 = o2.a("", i23);
        if (i19 < 10) {
            a10 = o2.a("0", i19);
        }
        if (i18 < 10) {
            a11 = o2.a("0", i18);
        }
        if (i20 < 10) {
            a12 = o2.a("0", i20);
        }
        if (i21 < 10) {
            a13 = o2.a("0", i21);
        }
        if (i22 < 10) {
            a14 = o2.a("0", i22);
        }
        if (i23 < 10) {
            a15 = o2.a("00", i23);
        } else if (i23 < 100) {
            a15 = o2.a("0", i23);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        String str = "-";
        sb2.append(str);
        sb2.append(a11);
        sb2.append(str);
        sb2.append(a10);
        s.a(sb2, " ", a12, ":", a13);
        String a16 = c.a(sb2, ":", a14, ".", a15);
        if (!z10) {
            return a16;
        }
        int i25 = (i24 / 1000) / 60;
        if (i24 < 0) {
            i25 *= -1;
        } else {
            str = "+";
        }
        int i26 = i25 / 60;
        int i27 = i25 % 60;
        String a17 = o2.a("", i26);
        String a18 = o2.a("", i27);
        if (i26 < 10) {
            a17 = o2.a("0", i26);
        }
        if (i27 < 10) {
            a18 = o2.a("0", i27);
        }
        return a16 + " " + str + a17 + a18;
    }

    public static TimeInfo a(TimeInfo timeInfo, long j10) {
        TimeInfo timeInfo2 = new TimeInfo();
        timeInfo2.DeviceDriftMillis = timeInfo.DeviceDriftMillis;
        timeInfo2.IsSynced = timeInfo.IsSynced;
        timeInfo2.MillisSinceLastSync = timeInfo.MillisSinceLastSync;
        timeInfo2.TimeSource = timeInfo.TimeSource;
        timeInfo2.TimestampDateTime = a(timeInfo.TimestampMillis + j10);
        timeInfo2.TimestampMillis = timeInfo.TimestampMillis + j10;
        timeInfo2.TimestampOffset = timeInfo.TimestampOffset;
        timeInfo2.TimestampTableau = b(timeInfo.TimestampMillis + j10);
        return timeInfo2;
    }
}
