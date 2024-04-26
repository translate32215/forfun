package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import s8.j;
import t7.b;
import u7.u;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class g<T> extends u {

    /* renamed from: b  reason: collision with root package name */
    public final j<T> f5793b;

    public g(int i10, j<T> jVar) {
        super(i10);
        this.f5793b = jVar;
    }

    public final void a(Status status) {
        this.f5793b.a(new b(status));
    }

    public final void b(Exception exc) {
        this.f5793b.a(exc);
    }

    public final void c(e<?> eVar) throws DeadObjectException {
        try {
            h(eVar);
        } catch (DeadObjectException e10) {
            this.f5793b.a(new b(j.e(e10)));
            throw e10;
        } catch (RemoteException e11) {
            this.f5793b.a(new b(j.e(e11)));
        } catch (RuntimeException e12) {
            this.f5793b.a(e12);
        }
    }

    public abstract void h(e<?> eVar) throws RemoteException;
}
