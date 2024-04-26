package com.startapp;

import android.content.SharedPreferences;
import java.util.UUID;

/* compiled from: Sta */
public class d5 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f10294a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f10295b;

    public d5(SharedPreferences sharedPreferences) {
        this.f10294a = sharedPreferences;
    }

    public String a() {
        String str = this.f10295b;
        if (str == null) {
            synchronized (this) {
                str = this.f10295b;
                if (str == null) {
                    str = this.f10294a.getString("e695c6d894060903", (String) null);
                    if (str == null) {
                        str = UUID.randomUUID().toString();
                        if (!this.f10294a.edit().putString("e695c6d894060903", str).commit()) {
                            str = "00000000-0000-0000-0000-000000000000";
                        }
                    }
                    this.f10295b = str;
                }
            }
        }
        return str;
    }
}
