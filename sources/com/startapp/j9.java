package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: Sta */
public class j9 {

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f10710k = MetaData.f12393k.W();

    /* renamed from: a  reason: collision with root package name */
    public Handler f10711a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public long f10712b;

    /* renamed from: c  reason: collision with root package name */
    public Context f10713c;

    /* renamed from: d  reason: collision with root package name */
    public long f10714d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10715e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10716f;

    /* renamed from: g  reason: collision with root package name */
    public String[] f10717g;

    /* renamed from: h  reason: collision with root package name */
    public TrackingParams f10718h;

    /* renamed from: i  reason: collision with root package name */
    public AtomicBoolean f10719i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    public WeakReference<a> f10720j = new WeakReference<>((Object) null);

    /* compiled from: Sta */
    public interface a {
        void onSent(String str);
    }

    public j9(Context context, String[] strArr, TrackingParams trackingParams, long j10) {
        this.f10713c = j0.b(context);
        this.f10717g = strArr;
        this.f10718h = trackingParams;
        this.f10712b = j10;
    }

    public void a() {
        if (this.f10715e && this.f10716f) {
            this.f10711a.removeCallbacksAndMessages((Object) null);
            this.f10712b -= System.currentTimeMillis() - this.f10714d;
            this.f10716f = false;
        }
    }

    public void b() {
        if (this.f10719i.get()) {
            return;
        }
        if (f10710k) {
            long j10 = this.f10712b;
            if (!this.f10716f) {
                this.f10716f = true;
                if (!this.f10715e) {
                    this.f10715e = true;
                }
                this.f10714d = System.currentTimeMillis();
                this.f10711a.postDelayed(new i9(this), j10);
                return;
            }
            return;
        }
        b((String) null, (JSONObject) null);
    }

    public void a(String str, JSONObject jSONObject) {
        b(str, jSONObject);
        this.f10715e = false;
        this.f10711a.removeCallbacksAndMessages((Object) null);
        this.f10716f = false;
        this.f10714d = 0;
    }

    public void b(String str, JSONObject jSONObject) {
        if (!this.f10719i.compareAndSet(false, true)) {
            return;
        }
        if (str == null) {
            Context context = this.f10713c;
            String[] strArr = this.f10717g;
            TrackingParams trackingParams = this.f10718h;
            if (!(context == null || strArr == null)) {
                h4.a(context, (List<String>) Arrays.asList(strArr), trackingParams);
            }
            a aVar = (a) this.f10720j.get();
            if (aVar != null) {
                String[] strArr2 = this.f10717g;
                String str2 = null;
                if (strArr2 != null && strArr2.length > 0) {
                    str2 = com.startapp.sdk.adsbase.a.a(strArr2[0], (String) null);
                }
                aVar.onSent(str2);
                return;
            }
            return;
        }
        com.startapp.sdk.adsbase.a.a(this.f10713c, this.f10717g, this.f10718h.a(), 0, str, jSONObject);
    }
}
