package com.startapp;

import android.location.Location;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.enums.TimeSources;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.Date;

/* compiled from: Sta */
public class ua {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String f12663j = "ua";

    /* renamed from: k  reason: collision with root package name */
    private static final String f12664k = "0.de.pool.ntp.org";

    /* renamed from: l  reason: collision with root package name */
    private static final long f12665l = 28800000;

    /* renamed from: m  reason: collision with root package name */
    private static final int f12666m = 10000;

    /* renamed from: n  reason: collision with root package name */
    private static final int f12667n = 30000;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f12668a = false;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f12669b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12670c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f12671d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f12672e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f12673f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f12674g = -1;

    /* renamed from: h  reason: collision with root package name */
    private long f12675h = -1;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public ba f12676i = new ba();

    public ua() {
        if (a5.b().NTP_SYNC_ENABLED()) {
            g();
        }
    }

    public static long d() {
        return a5.f().f();
    }

    public static TimeInfo e() {
        return a5.f().c();
    }

    private long f() {
        long j10;
        long elapsedRealtime;
        long j11;
        if (this.f12670c && this.f12674g > this.f12672e) {
            if (SystemClock.elapsedRealtime() - this.f12672e > f12665l) {
                b();
            }
            j10 = this.f12675h;
            elapsedRealtime = SystemClock.elapsedRealtime();
            j11 = this.f12674g;
        } else if (this.f12669b) {
            if (SystemClock.elapsedRealtime() - this.f12672e > f12665l) {
                b();
            }
            j10 = this.f12673f;
            elapsedRealtime = SystemClock.elapsedRealtime();
            j11 = this.f12672e;
        } else {
            b();
            return System.currentTimeMillis();
        }
        return (elapsedRealtime - j11) + j10;
    }

    private void g() {
        new a().executeOnExecutor(ThreadManager.b().a(), new Void[0]);
    }

    private TimeInfo c() {
        long j10;
        TimeInfo timeInfo = new TimeInfo();
        boolean z10 = this.f12669b;
        timeInfo.IsSynced = z10 || this.f12670c;
        if (this.f12670c && this.f12674g > this.f12672e) {
            j10 = (SystemClock.elapsedRealtime() - this.f12674g) + this.f12675h;
            timeInfo.DeviceDriftMillis = System.currentTimeMillis() - j10;
            timeInfo.MillisSinceLastSync = j10 - this.f12675h;
            timeInfo.TimeSource = TimeSources.GPS;
            if (SystemClock.elapsedRealtime() - this.f12672e > f12665l) {
                b();
            }
        } else if (z10) {
            if (SystemClock.elapsedRealtime() - this.f12672e > f12665l) {
                b();
            }
            j10 = (SystemClock.elapsedRealtime() - this.f12672e) + this.f12673f;
            timeInfo.DeviceDriftMillis = System.currentTimeMillis() - j10;
            timeInfo.MillisSinceLastSync = j10 - this.f12673f;
            timeInfo.TimeSource = TimeSources.NTP;
        } else {
            b();
            j10 = System.currentTimeMillis();
            timeInfo.TimeSource = TimeSources.Device;
        }
        timeInfo.setMillis(j10);
        return timeInfo;
    }

    private void b() {
        if (a5.b().NTP_SYNC_ENABLED() && !this.f12668a && SystemClock.elapsedRealtime() - this.f12671d > 30000) {
            g();
        }
    }

    public void a(Location location) {
        this.f12675h = location.getTime();
        this.f12674g = SystemClock.elapsedRealtime();
        this.f12670c = true;
    }

    /* compiled from: Sta */
    public class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                String unused = ua.f12663j;
                if (ua.this.f12676i.a(ua.f12664k, (int) ua.f12666m)) {
                    long a10 = ua.this.f12676i.a();
                    if (a10 <= 1458564533202L || a10 >= 3468524400000L) {
                        return null;
                    }
                    long unused2 = ua.this.f12672e = SystemClock.elapsedRealtime();
                    long unused3 = ua.this.f12673f = a10;
                    String unused4 = ua.f12663j;
                    new Date(ua.this.f12673f).toString();
                    boolean unused5 = ua.this.f12669b = true;
                    return null;
                }
                String unused6 = ua.f12663j;
                long unused7 = ua.this.f12671d = SystemClock.elapsedRealtime();
                return null;
            } catch (Throwable th) {
                x2.a(th);
                return null;
            }
        }

        public void onPreExecute() {
            boolean unused = ua.this.f12668a = true;
        }

        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            boolean unused = ua.this.f12668a = false;
        }
    }
}
