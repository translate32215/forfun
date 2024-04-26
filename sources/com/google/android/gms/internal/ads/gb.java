package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import e8.b10;
import g7.d;
import java.util.concurrent.atomic.AtomicReference;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gb {

    /* renamed from: a  reason: collision with root package name */
    public final fb f6631a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<s2> f6632b = new AtomicReference<>();

    public gb(fb fbVar) {
        this.f6631a = fbVar;
    }

    public final s2 a() throws RemoteException {
        s2 s2Var = this.f6632b.get();
        if (s2Var != null) {
            return s2Var;
        }
        e.K("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final ue b(String str, JSONObject jSONObject) throws b10 {
        x2 x2Var;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                x2Var = new m3((d) new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                x2Var = new m3((d) new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                x2Var = new m3((d) new zzapp());
            } else {
                s2 a10 = a();
                if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    if (a10.Z1(jSONObject.getString("class_name"))) {
                        x2Var = a10.g6("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                    } else {
                        x2Var = a10.g6("com.google.ads.mediation.customevent.CustomEventAdapter");
                    }
                }
                x2Var = a10.g6(str);
            }
        } catch (JSONException e10) {
            e.C("Invalid custom event.", e10);
        } catch (Throwable th) {
            throw new b10(th);
        }
        ue ueVar = new ue(x2Var);
        fb fbVar = this.f6631a;
        synchronized (fbVar) {
            if (!fbVar.f6456a.containsKey(str)) {
                try {
                    fbVar.f6456a.put(str, new eb(str, ueVar.c(), ueVar.d()));
                } catch (b10 unused) {
                }
            }
        }
        return ueVar;
    }

    public final a4 c(String str) throws RemoteException {
        a4 B3 = a().B3(str);
        fb fbVar = this.f6631a;
        synchronized (fbVar) {
            if (!fbVar.f6456a.containsKey(str)) {
                try {
                    fbVar.f6456a.put(str, new eb(str, B3.r0(), B3.m0()));
                } catch (Throwable unused) {
                }
            }
        }
        return B3;
    }
}
