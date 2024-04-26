package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import u7.h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f5798a;

    public j(int i10) {
        this.f5798a = i10;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(e<?> eVar) throws DeadObjectException;

    public abstract void d(h hVar, boolean z10);
}
