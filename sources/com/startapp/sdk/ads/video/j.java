package com.startapp.sdk.ads.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.net.URL;

/* compiled from: Sta */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public Context f12008a;

    /* renamed from: b  reason: collision with root package name */
    public URL f12009b;

    /* renamed from: c  reason: collision with root package name */
    public String f12010c;

    /* renamed from: d  reason: collision with root package name */
    public b f12011d;

    /* renamed from: e  reason: collision with root package name */
    public d.a f12012e;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12013a;

        public a(String str) {
            this.f12013a = str;
        }

        public void run() {
            b bVar = j.this.f12011d;
            if (bVar != null) {
                bVar.a(this.f12013a);
            }
        }
    }

    /* compiled from: Sta */
    public interface b {
        void a(String str);
    }

    public j(Context context, URL url, String str, b bVar, d.a aVar) {
        this.f12008a = context;
        this.f12009b = url;
        this.f12010c = str;
        this.f12011d = bVar;
        this.f12012e = aVar;
    }

    public void a() {
        String str;
        try {
            str = AdsCommonMetaData.f12098h.G().p() ? d.b.f11993a.a(this.f12008a, this.f12009b, this.f12010c, this.f12012e) : VideoUtil.a(this.f12008a, this.f12009b, this.f12010c);
        } catch (Exception unused) {
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new a(str));
    }
}
