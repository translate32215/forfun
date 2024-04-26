package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c8.a;
import c8.b;
import e8.fn;
import e8.jn;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class va extends k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8345a;

    /* renamed from: b  reason: collision with root package name */
    public final fn f8346b;

    /* renamed from: c  reason: collision with root package name */
    public final jn f8347c;

    public va(String str, fn fnVar, jn jnVar) {
        this.f8345a = str;
        this.f8346b = fnVar;
        this.f8347c = jnVar;
    }

    public final z R() throws RemoteException {
        z zVar;
        jn jnVar = this.f8347c;
        synchronized (jnVar) {
            zVar = jnVar.f15171p;
        }
        return zVar;
    }

    public final String b() throws RemoteException {
        return this.f8347c.e();
    }

    public final String c() throws RemoteException {
        return this.f8347c.a();
    }

    public final String getCallToAction() throws RemoteException {
        return this.f8347c.b();
    }

    public final hz getVideoController() throws RemoteException {
        return this.f8347c.h();
    }

    public final u h() throws RemoteException {
        return this.f8347c.v();
    }

    public final List<?> i() throws RemoteException {
        return this.f8347c.f();
    }

    public final String t() throws RemoteException {
        String t10;
        jn jnVar = this.f8347c;
        synchronized (jnVar) {
            t10 = jnVar.t("advertiser");
        }
        return t10;
    }

    public final a y() throws RemoteException {
        return new b(this.f8346b);
    }
}
