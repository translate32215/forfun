package com.startapp;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public abstract class f3 {

    /* renamed from: a  reason: collision with root package name */
    public Intent f10350a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f10351b;

    /* renamed from: c  reason: collision with root package name */
    public AdInformationObject f10352c = null;

    /* renamed from: d  reason: collision with root package name */
    public BroadcastReceiver f10353d = new a();

    /* renamed from: e  reason: collision with root package name */
    public String[] f10354e;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f10355f;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f10356g = {true};

    /* renamed from: h  reason: collision with root package name */
    public String f10357h;

    /* renamed from: i  reason: collision with root package name */
    public String[] f10358i;

    /* renamed from: j  reason: collision with root package name */
    public String[] f10359j;

    /* renamed from: k  reason: collision with root package name */
    public String[] f10360k;

    /* renamed from: l  reason: collision with root package name */
    public Ad f10361l;

    /* renamed from: m  reason: collision with root package name */
    public String f10362m;

    /* renamed from: n  reason: collision with root package name */
    public AdPreferences.Placement f10363n;

    /* renamed from: o  reason: collision with root package name */
    public AdInformationOverrides f10364o;

    /* renamed from: p  reason: collision with root package name */
    public String f10365p;

    /* renamed from: q  reason: collision with root package name */
    public Long f10366q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean[] f10367r = null;

    /* renamed from: s  reason: collision with root package name */
    public int f10368s = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10369t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10370u = false;

    /* compiled from: Sta */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            f3.this.b();
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            f3.this.f10351b.finish();
        }
    }

    public void a(Configuration configuration) {
    }

    public abstract void a(Bundle bundle);

    public boolean a(int i10) {
        boolean[] zArr = this.f10356g;
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return true;
        }
        return zArr[i10];
    }

    public boolean a(int i10, KeyEvent keyEvent) {
        return false;
    }

    public void b() {
        this.f10351b.runOnUiThread(new b());
    }

    public void b(Bundle bundle) {
    }

    public boolean c() {
        return false;
    }

    public void d() {
        if (this.f10353d != null) {
            a6.a((Context) this.f10351b).a(this.f10353d);
        }
        this.f10353d = null;
    }

    public abstract void e();

    public abstract void f();

    public void g() {
    }

    public void h() {
        a6.a((Context) this.f10351b).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    public String a() {
        try {
            String[] strArr = this.f10358i;
            if (strArr == null || strArr.length <= 0) {
                return "";
            }
            return com.startapp.sdk.adsbase.a.a(strArr[0], (String) null);
        } catch (Throwable th) {
            i4.a(th);
            return "";
        }
    }

    public void a(String str) {
        String str2;
        if (str == null || (str2 = this.f10365p) == null || str2.length() <= 0) {
            this.f10362m = str;
        } else {
            this.f10362m = str.replaceAll("startapp_adtag_placeholder", this.f10365p);
        }
    }
}
