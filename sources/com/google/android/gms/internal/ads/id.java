package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e8.ah;
import e8.fi0;
import e8.zv;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class id {

    /* renamed from: a  reason: collision with root package name */
    public final jd<ah> f7071a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7072b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public gz f7073c;

    public id(jd<ah> jdVar, String str) {
        this.f7071a = jdVar;
        this.f7072b = str;
    }

    public final synchronized void a(fi0 fi0, int i10) throws RemoteException {
        this.f7073c = null;
        this.f7071a.k(fi0, this.f7072b, new zv(i10), new g2(this));
    }
}
