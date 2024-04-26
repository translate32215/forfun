package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.activity.k;
import c7.a;
import c7.b;
import com.google.android.gms.common.internal.i;
import e8.ti0;
import java.util.ArrayList;
import javax.annotation.concurrent.GuardedBy;
import l0.e;
import y6.l;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public class oz {
    @GuardedBy("InternalMobileAds.class")

    /* renamed from: i  reason: collision with root package name */
    public static oz f7780i;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<b> f7781a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final Object f7782b = new Object();
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    public ry f7783c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7784d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7785e = false;

    /* renamed from: f  reason: collision with root package name */
    public k7.b f7786f;

    /* renamed from: g  reason: collision with root package name */
    public l f7787g = new l(-1, -1, (String) null, new ArrayList(), (k) null);

    /* renamed from: h  reason: collision with root package name */
    public a f7788h;

    public static oz c() {
        oz ozVar;
        synchronized (oz.class) {
            if (f7780i == null) {
                f7780i = new oz();
            }
            ozVar = f7780i;
        }
        return ozVar;
    }

    public final String a() {
        String b10;
        synchronized (this.f7782b) {
            i.k(this.f7783c != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                b10 = qg.b(this.f7783c.j6());
            } catch (RemoteException e10) {
                e.C("Unable to get version string.", e10);
                return "";
            }
        }
        return b10;
    }

    @GuardedBy("lock")
    public final void b(Context context) {
        if (this.f7783c == null) {
            this.f7783c = (ry) new lx(ti0.f16763j.f16765b, context).b(context, false);
        }
    }
}
