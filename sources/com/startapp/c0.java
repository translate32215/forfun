package com.startapp;

import android.content.SharedPreferences;

/* compiled from: Sta */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10221a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f10222b;

    /* renamed from: c  reason: collision with root package name */
    public volatile String f10223c;

    /* renamed from: d  reason: collision with root package name */
    public volatile String f10224d;

    public c0(SharedPreferences sharedPreferences) {
        this.f10222b = sharedPreferences;
    }

    public boolean a() {
        boolean contains;
        synchronized (this.f10221a) {
            contains = this.f10222b.contains("2696a7f502faed4b");
        }
        return contains;
    }
}
