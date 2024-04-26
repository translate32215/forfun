package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: Sta */
public class id {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f10561a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<View> f10562b;

    /* renamed from: c  reason: collision with root package name */
    public final BannerOptions f10563c;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10564a;

        public a(b bVar) {
            this.f10564a = bVar;
        }

        public void run() {
            if (this.f10564a.onUpdate(id.a(id.this))) {
                id.this.f10561a.postDelayed(this, 100);
            }
        }
    }

    /* compiled from: Sta */
    public interface b {
        boolean onUpdate(boolean z10);
    }

    public id(View view, BannerOptions bannerOptions, b bVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f10561a = handler;
        this.f10562b = new WeakReference<>(view);
        this.f10563c = bannerOptions;
        handler.postDelayed(new a(bVar), 100);
    }

    public void a() {
        this.f10561a.removeCallbacksAndMessages((Object) null);
    }

    public static boolean a(id idVar) {
        return gd.a((View) idVar.f10562b.get(), idVar.f10563c, (AtomicReference<JSONObject>) new AtomicReference()) == null;
    }
}
