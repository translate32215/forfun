package com.startapp;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Collections;
import xb.a;

/* compiled from: Sta */
public final class pe extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11610a;

    /* renamed from: b  reason: collision with root package name */
    public final AudioManager f11611b;

    /* renamed from: c  reason: collision with root package name */
    public final yd f11612c;

    /* renamed from: d  reason: collision with root package name */
    public final le f11613d;

    /* renamed from: e  reason: collision with root package name */
    public float f11614e;

    public pe(Handler handler, Context context, yd ydVar, le leVar) {
        super(handler);
        this.f11610a = context;
        this.f11611b = (AudioManager) context.getSystemService("audio");
        this.f11612c = ydVar;
        this.f11613d = leVar;
    }

    public final float a() {
        int streamVolume = this.f11611b.getStreamVolume(3);
        int streamMaxVolume = this.f11611b.getStreamMaxVolume(3);
        this.f11612c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f10 = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public final void b() {
        le leVar = this.f11613d;
        float f10 = this.f11614e;
        xe xeVar = (xe) leVar;
        xeVar.f12807a = f10;
        if (xeVar.f12811e == null) {
            xeVar.f12811e = pd.f11607c;
        }
        for (T t10 : Collections.unmodifiableCollection(xeVar.f12811e.f11609b)) {
            a aVar = t10.f11678e;
            re.f11684a.a(aVar.c(), "setDeviceVolume", Float.valueOf(f10));
        }
    }

    public void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a10 != this.f11614e) {
            this.f11614e = a10;
            b();
        }
    }
}
