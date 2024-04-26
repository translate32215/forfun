package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* compiled from: ConfigMetadataClient */
public class d {

    /* renamed from: d  reason: collision with root package name */
    public static final Date f9795d = new Date(-1);

    /* renamed from: e  reason: collision with root package name */
    public static final Date f9796e = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f9797a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9798b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f9799c = new Object();

    /* compiled from: ConfigMetadataClient */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9800a;

        /* renamed from: b  reason: collision with root package name */
        public Date f9801b;

        public a(int i10, Date date) {
            this.f9800a = i10;
            this.f9801b = date;
        }
    }

    public d(SharedPreferences sharedPreferences) {
        this.f9797a = sharedPreferences;
    }

    public a a() {
        a aVar;
        synchronized (this.f9799c) {
            aVar = new a(this.f9797a.getInt("num_failed_fetches", 0), new Date(this.f9797a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    public void b(int i10, Date date) {
        synchronized (this.f9799c) {
            this.f9797a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
