package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c8.a;
import c8.b;
import e8.fn;
import e8.jn;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ua extends h0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8231a;

    /* renamed from: b  reason: collision with root package name */
    public final fn f8232b;

    /* renamed from: c  reason: collision with root package name */
    public final jn f8233c;

    public ua(String str, fn fnVar, jn jnVar) {
        this.f8231a = str;
        this.f8232b = fnVar;
        this.f8233c = jnVar;
    }

    public final String b() throws RemoteException {
        return this.f8233c.e();
    }

    public final String c() throws RemoteException {
        return this.f8233c.a();
    }

    public final String getCallToAction() throws RemoteException {
        return this.f8233c.b();
    }

    public final hz getVideoController() throws RemoteException {
        return this.f8233c.h();
    }

    public final u h() throws RemoteException {
        return this.f8233c.v();
    }

    public final List<?> i() throws RemoteException {
        return this.f8233c.f();
    }

    public final double k() throws RemoteException {
        double d10;
        jn jnVar = this.f8233c;
        synchronized (jnVar) {
            d10 = jnVar.f15169n;
        }
        return d10;
    }

    public final String r() throws RemoteException {
        String t10;
        jn jnVar = this.f8233c;
        synchronized (jnVar) {
            t10 = jnVar.t("price");
        }
        return t10;
    }

    public final String u() throws RemoteException {
        String t10;
        jn jnVar = this.f8233c;
        synchronized (jnVar) {
            t10 = jnVar.t("store");
        }
        return t10;
    }

    public final z w() throws RemoteException {
        z zVar;
        jn jnVar = this.f8233c;
        synchronized (jnVar) {
            zVar = jnVar.f15170o;
        }
        return zVar;
    }

    public final a y() throws RemoteException {
        return new b(this.f8232b);
    }
}
