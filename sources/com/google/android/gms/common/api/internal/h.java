package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.appcompat.widget.m;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import f7.v;
import s8.j;
import t7.a;
import t7.b;
import t7.g;
import u7.u;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class h<ResultT> extends u {

    /* renamed from: b  reason: collision with root package name */
    public final c<a.b, ResultT> f5794b;

    /* renamed from: c  reason: collision with root package name */
    public final j<ResultT> f5795c;

    /* renamed from: d  reason: collision with root package name */
    public final v f5796d;

    public h(int i10, c<a.b, ResultT> cVar, j<ResultT> jVar, v vVar) {
        super(i10);
        this.f5795c = jVar;
        this.f5794b = cVar;
        this.f5796d = vVar;
        if (i10 == 2 && cVar.f5773b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        Exception exc;
        j<ResultT> jVar = this.f5795c;
        this.f5796d.getClass();
        if (status.f5746d != null) {
            exc = new g(status);
        } else {
            exc = new b(status);
        }
        jVar.a(exc);
    }

    public final void b(Exception exc) {
        this.f5795c.a(exc);
    }

    public final void c(e<?> eVar) throws DeadObjectException {
        try {
            this.f5794b.a(eVar.f5780b, this.f5795c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(j.e(e11));
        } catch (RuntimeException e12) {
            this.f5795c.a(e12);
        }
    }

    public final void d(u7.h hVar, boolean z10) {
        j<ResultT> jVar = this.f5795c;
        hVar.f26105b.put(jVar, Boolean.valueOf(z10));
        jVar.f25035a.b(new m(hVar, (j) jVar));
    }

    public final boolean f(e<?> eVar) {
        return this.f5794b.f5773b;
    }

    public final Feature[] g(e<?> eVar) {
        return this.f5794b.f5772a;
    }
}
